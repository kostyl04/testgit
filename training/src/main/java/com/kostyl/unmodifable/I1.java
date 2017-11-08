package com.kostyl.unmodifable;

public interface I1 extends I2,I3{

	@Override
	default void test() {
		// TODO Auto-generated method stub
		I3.super.test();
	}
	Number test2();
	
}
