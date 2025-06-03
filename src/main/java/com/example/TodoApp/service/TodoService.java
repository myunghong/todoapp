package com.example.TodoApp.service;

import com.example.TodoApp.Repository.TodoRepository;
import com.example.TodoApp.entity.TodoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TodoService {

    private TodoRepository todoRepository;

    public String testService() {
        TodoEntity entity = TodoEntity.builder().title("스프링 공부하기").build();
        todoRepository.save(entity);
        TodoEntity savedEntity = todoRepository.findById(entity.getId()).orElse(null);
        return savedEntity.getTitle();
    }


    public List<TodoEntity> create(final TodoEntity entity) {
        validate(entity);
        todoRepository.save(entity);
        log.info("Entity {} saved", entity.getId());
        return todoRepository.findByUserId(entity.getUserId());
    }

    public List<TodoEntity> retrieve(final String userId){
        return todoRepository.findByUserId(userId);
    }

    public List<TodoEntity> update(final TodoEntity entity){
        validate(entity);
        Optional<TodoEntity> original = todoRepository.findById(entity.getId());
        original.ifPresent(todo -> {
            todo.setTitle(entity.getTitle());
            todo.setDone(entity.isDone());
            todoRepository.save(todo);
        });
        return retrieve(entity.getUserId());
    }


    private void validate(final TodoEntity entity){
        if(entity == null) {
            log.warn("Entity can't be null");
            throw new RuntimeException("Entity can't be null");
        }

        if(entity.getUserId() == null) {
            log.warn("UserId can't be null");
            throw new RuntimeException("UserId can't be null");
        }
    }
}
