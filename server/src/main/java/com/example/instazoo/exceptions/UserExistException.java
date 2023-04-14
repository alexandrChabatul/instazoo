package com.example.instazoo.exceptions;

import org.springframework.http.HttpStatus;

public class UserExistException extends HttpException {

    public UserExistException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
