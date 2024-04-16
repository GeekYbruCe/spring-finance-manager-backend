package com.sll.personalfinancemanagerbackend.exceptions;

public class InsufficientFundsException extends RuntimeException {

    private String message;

    public InsufficientFundsException (String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
