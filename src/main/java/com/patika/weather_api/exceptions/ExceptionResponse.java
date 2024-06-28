package com.patika.weather_api.exceptions;


import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
public class ExceptionResponse {

    private String message;
    private HttpStatus httpStatus;
    private LocalDateTime localDateTime;
}
