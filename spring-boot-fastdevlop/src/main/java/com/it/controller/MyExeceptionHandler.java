package com.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExeceptionHandler {


    @ExceptionHandler(Exception.class)
    public String handlerExeception(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", HttpStatus.CREATED);
        map.put("message", e.getMessage());

        return "emps";
    }
}
