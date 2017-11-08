package com.kostyl;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayListStack<E> implements MyStack<E> {
    private Object[] items;
    private int size;
    private int topIndex;

    public int size() {
        return size;
    }

    public void push(E elem) {
        if (items.length <= size) {
            Object[] newItems = new Object[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items=newItems;
        }
        topIndex++;
        items[topIndex] = elem;
        size++;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E elem = (E) items[topIndex];
        items[topIndex] = null;
        size--;
        topIndex--;
        return elem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (size == 0)
            throw new EmptyStackException();
        return (E) items[topIndex];
    }

    public ArrayListStack() {
        this.items = new Object[10];
        size = 0;
        topIndex = -1;
    }
}
