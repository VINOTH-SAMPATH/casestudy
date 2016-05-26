/*
 * Copyright (c) Tata Consultancy Services. All Rights Reserved.
 * ============================================================
 */
package com.tcs.nawax.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
 
@ControllerAdvice
public abstract class AbstractController extends ResponseEntityExceptionHandler {

    /**
     * Handling exception for Number Format Exception
     * 
     * @param illegalArgumentException the illegalArgumentException object
     * @return the error response
     */
    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String handleIllegalArgumentException(final IllegalArgumentException illegalArgumentException) {
        return "Bad request";
    }

    /**
     * Handling any kind of exception and error
     * 
     * @param throwable the throwable object
     * @return the error response
     */
    @ExceptionHandler({Throwable.class})
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String handleThrowable(final Throwable throwable) {
        return "Unknown Exception occured";
    }
}
