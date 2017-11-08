package com.kostyl;

public interface MyStack<E> {
    int size();

    void push(E elem);

    E pop();

    boolean isEmpty();

    E peek();
}
