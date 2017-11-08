package com.kostyl.unmodifable;

public class TestObj implements I1 {
	private String string;

	public TestObj(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public void test() {
		StringBuilder sb = new StringBuilder("asdasd");
		testString(sb);
		System.out.println(sb.toString());
	}

	private void testString(StringBuilder sb) {
		sb.append("1");
	}

	public static class NestedStatic {
		public void set() {

		}
	}
	public boolean equals(Object o) {
		return ((TestObj)o).string.equals(string);
	}
	public int hashCode() {
		return 1+string.length();
	}

	@Override
	public Integer test2() {
		// TODO Auto-generated method stub
		return null;
	}
}
