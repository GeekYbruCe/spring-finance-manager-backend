package com.sll.personalfinancemanagerbackend.exceptions;

public class ValidationException extends RuntimeException{
    private String message;

    public ValidationException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}