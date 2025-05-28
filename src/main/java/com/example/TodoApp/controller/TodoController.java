package com.example.TodoApp.controller;

import com.example.TodoApp.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @GetMapping("/list")
    public ResponseEntity<?> testTodo (){
        ResponseDTO responseDTO = new ResponseDTO();
        return ResponseEntity.ok().build();
    }
}
