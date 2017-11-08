package com.kostyl;

public interface MyQueue<E> {
    E remove();

    E poll();

    void push(E item);

    boolean isEmpty();
    void removeAll();
}
