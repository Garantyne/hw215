package com.example.hw215;

public class InvaledIndexException extends RuntimeException {
    public InvaledIndexException() {
    }

    public InvaledIndexException(String message) {
        super(message);
    }

    public InvaledIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvaledIndexException(Throwable cause) {
        super(cause);
    }

    public InvaledIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
