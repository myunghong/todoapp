package com.example.TodoApp.controller;

import com.example.TodoApp.dto.ResponseDTO;
import com.example.TodoApp.dto.TestReqeustBodyDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("/responsebody")
    public ResponseDTO<String> testControllerRequestParam() {
        List<String> list = new ArrayList<>();
        list.add("Hi, I'm responseDTO");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }
}
