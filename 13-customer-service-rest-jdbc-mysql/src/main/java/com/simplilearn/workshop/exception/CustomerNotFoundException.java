package com.simplilearn.workshop.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import jdk.jshell.spi.ExecutionControl.RunException;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {
    
    public CustomerNotFoundException(String description) {
        super(description);
    }

}