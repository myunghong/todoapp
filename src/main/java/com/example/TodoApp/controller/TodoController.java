package com.example.TodoApp.controller;

import com.example.TodoApp.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @GetMapping("/list")
    public ResponseEntity<?> testTodo (){
        List<String> list = new ArrayList<>();
        list.add("A");
        ResponseDTO<String> responseDTO = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.ok().body(responseDTO);
    }
}
