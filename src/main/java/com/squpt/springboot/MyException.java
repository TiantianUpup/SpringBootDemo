package com.squpt.springboot;

/**
 * Created by I am master on 2017/10/7.
 */
public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        super(message);
    }
}
