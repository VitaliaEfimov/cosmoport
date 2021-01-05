package com.space.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
class IncorrectInputException extends RuntimeException {
    public IncorrectInputException() {
    }

    public IncorrectInputException(String message) {
        super(message);
    }

    public IncorrectInputException(Throwable cause) {
        super(cause);
    }

    public IncorrectInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
