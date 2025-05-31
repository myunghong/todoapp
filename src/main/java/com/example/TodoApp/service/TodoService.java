package com.example.TodoApp.service;

import com.example.TodoApp.Repository.TodoRepository;
import com.example.TodoApp.entity.TodoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
