package com.soygul.capacitor;

/**
 * State mutation event subscriber.
 */
public interface Subscriber<T> {
    void onStateChange(T state);
}
