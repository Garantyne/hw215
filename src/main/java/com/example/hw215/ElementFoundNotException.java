package com.example.hw215;

public class ElementFoundNotException extends RuntimeException {

    public ElementFoundNotException() {
    }

    public ElementFoundNotException(String message) {
        super(message);
    }

    public ElementFoundNotException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementFoundNotException(Throwable cause) {
        super(cause);
    }

    public ElementFoundNotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
