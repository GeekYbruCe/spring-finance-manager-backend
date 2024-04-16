package com.sll.personalfinancemanagerbackend.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private String message;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
