package com.kostyl;

import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements MyQueue<E> {
    private int size;
    private Item<E> firstInQueue;
    private Item<E> lastInQueue;

    public E remove() {
        if (size == 0)
            throw new NoSuchElementException();
        E item = firstInQueue.item;
        firstInQueue = firstInQueue.next;
        size--;
        return item;
    }

    public E poll() {
        if (size == 0)
            return null;
        E item = firstInQueue.item;
        firstInQueue = firstInQueue.next;
        size--;
        return item;
    }

    public void push(E item) {
        if (size == 0) {
            firstInQueue = new Item<E>(null, item);
            lastInQueue = firstInQueue;
            size++;
        } else {
            Item<E> newLastItem = new Item<E>(null, item);
            lastInQueue.next = newLastItem;
            lastInQueue = newLastItem;
            size++;
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeAll() {
        while (firstInQueue.next != null) {
            firstInQueue = firstInQueue.next;
        }
        size = 0;
    }

    public LinkedListQueue() {
        size = 0;
    }

    private static class Item<E> {
        Item<E> next;
        E item;

        public Item(Item<E> next, E item) {
            this.next = next;
            this.item = item;
        }
    }
}
