package com.epam.mjc;

public class NoSuchStudentIdException extends IllegalArgumentException{
    public NoSuchStudentIdException(String message){
        super(message);
    }
    public NoSuchStudentIdException (String message, Throwable cause){
        super(message, cause);
    }
}
