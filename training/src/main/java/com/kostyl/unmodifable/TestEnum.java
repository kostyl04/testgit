package com.kostyl.unmodifable;

public enum TestEnum {
	DOCUMENT(new TestObj("asd"));
	private TestObj obj;

	public TestObj getObj() {
		return obj;
	}

	public void setObj(TestObj obj) {
		this.obj = obj;
	}

	private TestEnum(TestObj obj) {
		this.obj = obj;
	}

}
