package com.patika.weather_conditions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(WeatherException weatherException){
        ExceptionResponse exceptionResponse=new ExceptionResponse(weatherException.getMessage(),weatherException.getHttpStatus(), LocalDateTime.now());

        return new ResponseEntity<>(exceptionResponse,weatherException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(Exception exception){
        ExceptionResponse exceptionResponse=new ExceptionResponse(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now());

        return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
