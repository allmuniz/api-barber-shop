package com.allmuniz.apibarbershop.exceptions;

public class PhoneInUseException extends RuntimeException {
    public PhoneInUseException(String message) {
        super(message);
    }
}
