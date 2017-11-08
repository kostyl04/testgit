package com.kostyl;


import org.junit.Assert;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {
    MyQueue<String> queue;

    @BeforeEach
    public void add20Elements() {

        queue = new LinkedListQueue<String>();
        for (int i = 0; i < 21; i++) {
            queue.push("Elem" + i);
        }
    }

    @Test
    public void checkFirstElemEquals() {


        Assert.assertEquals("Elem0", queue.remove());
        Assert.assertEquals("Elem1", queue.remove());
        Assert.assertEquals("Elem2", queue.remove());
    }

    @Test
    @DisplayName("check exception thrown on remove")
    public void checkException() {
        queue.removeAll();
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }
}
