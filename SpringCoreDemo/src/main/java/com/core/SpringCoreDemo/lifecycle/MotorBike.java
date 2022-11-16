package com.core.SpringCoreDemo.lifecycle;

public class MotorBike {
	private String name;
	private double price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MotorBike [name=" + name + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("The bean is initialized");
	}

	public void destroy() {
		System.out.println("The bean is destroyed");
	}
	
}
