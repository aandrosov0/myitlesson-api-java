package ru.myitlesson;

public class APIException extends RuntimeException {
    public APIException(String message) {
        super(message);
    }
}