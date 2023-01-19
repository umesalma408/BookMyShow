package com.example.BookMyShow.Model.exception;

//public class DuplicateEntityException {
//}
public class DuplicateEntityException extends RuntimeException{

    private final String message;

    public DuplicateEntityException(String message) {
        super(message);
        this.message = message;
    }
}
