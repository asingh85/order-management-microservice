package com.webtutsplus.order.exceptions;

public class UpdateFailException extends IllegalArgumentException {
    public UpdateFailException(String msg) {
        super(msg);
    }
}
