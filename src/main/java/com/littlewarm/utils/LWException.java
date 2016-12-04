package com.littlewarm.utils;

public class LWException extends Exception {
    public LWException(String msg) {
        super(msg);
    }

    public LWException(String msg, Exception e) {
        super(msg, e);
    }
}
