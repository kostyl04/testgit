package com.kostyl.unmodifable;

public interface I2 {
	default void test() {
		System.out.println("I2");
	}
}
