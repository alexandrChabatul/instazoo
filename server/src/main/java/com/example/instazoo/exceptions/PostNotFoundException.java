package com.example.instazoo.exceptions;

import org.springframework.http.HttpStatus;

public class PostNotFoundException extends HttpException {
    public PostNotFoundException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
