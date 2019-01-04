package com.bj.group6.exception;


public class GlobalException extends Exception {

    private String message;

    public GlobalException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
