package ru.myitlesson;

import ru.myitlesson.exception.APIException;
import ru.myitlesson.exception.EntryIsEmptyException;
import ru.myitlesson.exception.NotFoundException;

import java.lang.reflect.InvocationTargetException;

public enum StatusErrorCode {
    NOT_FOUND(0, NotFoundException.class),
    ENTRY_IS_EMPTY(1, EntryIsEmptyException.class),
    ERROR(1, APIException.class);

    private final int statusCode;
    private final Class<?> tClass;

    StatusErrorCode(int statusCode, Class<?> tClass) {
        this.statusCode = statusCode;
        this.tClass = tClass;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public APIException makeException(String err) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (APIException) tClass.getConstructor(String.class).newInstance(err);
    }
}
