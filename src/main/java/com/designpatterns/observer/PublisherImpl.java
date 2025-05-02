package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements IPublisher{

    private final List<ISubscriber> observers = new ArrayList<>();

    @Override
    public void addObserver(ISubscriber observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ISubscriber observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String message) {
        for(ISubscriber observer : observers){
            observer.update(message);
        }
    }
}
