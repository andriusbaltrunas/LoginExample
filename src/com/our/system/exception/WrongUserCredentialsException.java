package com.our.system.exception;

/**
 * Created by andriusbaltrunas on 10/20/2017.
 */
public class WrongUserCredentialsException extends Exception {
    public WrongUserCredentialsException(String message) {
        super(message);
    }

    public WrongUserCredentialsException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongUserCredentialsException(Throwable cause) {
        super(cause);
    }
}
