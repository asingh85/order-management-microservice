package com.webtutsplus.order.exceptions;

public class CartItemNotExistException extends IllegalArgumentException {
    public CartItemNotExistException(String msg) {
        super(msg);
    }
}
