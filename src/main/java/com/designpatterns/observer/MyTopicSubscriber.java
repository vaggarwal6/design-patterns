package com.designpatterns.observer;

public class MyTopicSubscriber implements ISubscriber {

    private IPublisher publisher;

    //Setting the publisher also to the consumer
    public MyTopicSubscriber(IPublisher publisher){
        this.publisher = publisher;
    }

    @Override
    public void update(String message) {
        System.out.println("Update Called");
    }
}
