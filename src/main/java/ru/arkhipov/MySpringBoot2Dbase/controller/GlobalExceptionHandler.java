package ru.arkhipov.MySpringBoot2Dbase.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Map<String, Object>> handleAllExceptions(Exception ex) {

        var errorId = "E" + ThreadLocalRandom.current().nextInt(100_000, 1_000_000);

        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("errorId", errorId);
        errorResponse.put("timestamp", System.currentTimeMillis());
        errorResponse.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.put("error", "Internal Server Error");
        errorResponse.put("message", "Внутренняя ошибка сервера");
        errorResponse.put("success", false);

        var errorMessage = "Global Error: " + errorId;
        log.error(errorMessage, ex);

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
