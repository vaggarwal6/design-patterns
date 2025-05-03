package com.designpatterns.chainofresponsibility;

import java.util.logging.Logger;

public class ValidationHandler implements IHandler{

    private IHandler nextHandler;
    private IHandler exceptionHandler;

    private static final Logger LOGGER = Logger.getLogger(ValidationHandler.class.getName());

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void onExceptionHandler(IHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override
    public void handleRequest() {

        try {
            LOGGER.info("Processing Validation");
            if(nextHandler != null)
                nextHandler.handleRequest();
        }
        catch (Exception e){
            if(exceptionHandler != null)
                exceptionHandler.handleRequest();
        }

    }
}
