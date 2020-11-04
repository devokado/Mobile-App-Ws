package com.devacado.app.ws.exceptions;

public class UserServiceException extends RuntimeException{
    private static final long serialVersionUID = 4456627288106529131L;

    public UserServiceException(String message) {
        super(message);
    }
}
