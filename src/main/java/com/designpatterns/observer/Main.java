package com.designpatterns.observer;

public class Main {

    public static void main(String[] args) {

        IPublisher publisher = new PublisherImpl();
        ISubscriber observer1 = new MyTopicSubscriber(publisher);
        ISubscriber observer2= new MyTopicSubscriber(publisher);
        ISubscriber observer3 = new MyTopicSubscriber(publisher);
        publisher.addObserver(observer1);
        publisher.addObserver(observer2);
        publisher.addObserver(observer3);
        publisher.notifyAll("Message Pushed");
    }
}
