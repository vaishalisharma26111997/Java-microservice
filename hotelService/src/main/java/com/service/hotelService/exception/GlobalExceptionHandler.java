package com.service.hotelService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> notFoundHandler(ResourceNotFoundException ex)
    {
        Map map=new HashMap();
        map.put("STATUS",false);
        map.put("MESSAGE",ex.getMessage());
        map.put("CODE", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

}