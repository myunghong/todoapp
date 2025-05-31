package com.example.TodoApp.service;

import com.example.TodoApp.Repository.TodoRepository;
import com.example.TodoApp.model.TodoEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public String testService() {
        TodoEntity entity = TodoEntity.builder().title("스프링 공부하기").build();
        todoRepository.save(entity);
        TodoEntity savedEntity = todoRepository.findById(entity.getId()).orElse(null);
        return savedEntity.getTitle();
    }
}
