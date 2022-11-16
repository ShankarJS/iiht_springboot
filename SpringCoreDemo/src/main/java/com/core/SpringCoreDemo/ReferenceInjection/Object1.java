package com.core.SpringCoreDemo.ReferenceInjection;

public class Object1 {
	private int x;
	private Object2 ob;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Object2 getOb() {
		return ob;
	}

	public void setOb(Object2 ob) {
		this.ob = ob;
	}

	public Object1() {
		super();
	}

	@Override
	public String toString() {
		return "Object1 [x=" + x + ", ob=" + ob + "]";
	}

}