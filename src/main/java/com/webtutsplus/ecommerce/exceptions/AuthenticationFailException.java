package com.webtutsplus.order.exceptions;

public class AuthenticationFailException extends IllegalArgumentException {
    public AuthenticationFailException(String msg) {
        super(msg);
    }
}
