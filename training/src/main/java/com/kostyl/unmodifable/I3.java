package com.kostyl.unmodifable;

public interface I3 {
	default void test() {
		System.out.println("I3");
	}
}
