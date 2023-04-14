package com.example.instazoo.exceptions;

import org.springframework.http.HttpStatus;

public class ImageNotFoundException extends HttpException {

    public ImageNotFoundException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }

}
