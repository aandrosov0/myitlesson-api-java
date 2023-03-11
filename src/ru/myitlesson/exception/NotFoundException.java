package ru.myitlesson.exception;

public class NotFoundException extends APIException {
    public NotFoundException(String message) {
        super(message);
    }
}
