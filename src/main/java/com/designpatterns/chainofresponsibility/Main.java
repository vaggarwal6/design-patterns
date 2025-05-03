package com.designpatterns.chainofresponsibility;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {



        IHandler paymentHandler = new PaymentHandler();
        IHandler validationHandler = new ValidationHandler();
        IHandler orderHandler = new OrderHandler();

        validationHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(orderHandler);

        validationHandler.handleRequest();

    }
}
