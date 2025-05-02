package com.designpatterns.observer;

public interface IPublisher {

    void addObserver(ISubscriber observer);
    void removeObserver(ISubscriber observer);
    void notifyAll(String message);

}
