package com.designpatterns.chainofresponsibility;

public interface IHandler {

    void setNextHandler(IHandler nextHandler);
    void onExceptionHandler(IHandler exceptionHandler);
    void handleRequest();
}
