package com.patika.weather_conditions.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class WeatherException extends RuntimeException{
    private HttpStatus httpStatus;

    public WeatherException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
