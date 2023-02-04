package com.nus.iss.workshop1241.workshop1241.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InValidNumberException extends RuntimeException {

    public InValidNumberException(String message) {
        super(message);
    }

}
