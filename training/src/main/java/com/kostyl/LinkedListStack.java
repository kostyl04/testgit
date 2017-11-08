package com.kostyl;

import java.util.EmptyStackException;

public class LinkedListStack<E> implements MyStack<E> {
    private int size;
    private Item<E> topItem;

    public int size() {
        return size;
    }

    public void push(E elem) {
        topItem = new Item<E>(elem, topItem);
        size++;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E elem = topItem.getItem();
        topItem = topItem.prev;
        size--;
        return elem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return topItem.getItem();
    }

    public LinkedListStack() {
    }


    private static class Item<E> {
        private E item;
        Item<E> prev;

        public Item(E item, Item<E> prev) {
            this.setItem(item);
            this.prev = prev;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }
    }
}
