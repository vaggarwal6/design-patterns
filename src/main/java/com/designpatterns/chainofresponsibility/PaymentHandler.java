package com.designpatterns.chainofresponsibility;

public class PaymentHandler implements IHandler{

    private IHandler nextHandler;
    private IHandler exceptionHandler;

    PaymentHandler(){
    }

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
            System.out.println("Processing Payment");
            if(nextHandler != null)
                nextHandler.handleRequest();
        }
        catch (Exception e){
            if(exceptionHandler != null)
                exceptionHandler.handleRequest();
        }
    }
}
