
package com.designpatterns.singleton;

public class Singleton {

    // Volatile ensures visibility of changes to variables across threads
    private static volatile Singleton instance = null;

    private Singleton() {
        // Prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking) ensures synchronization only happens when instance is being created
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
