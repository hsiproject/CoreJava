package com.project.car;
//class is a blueprint of an object and it should contain properties & methods of the object//
public class Car {

	int slNo;
	String name;
	String colour;
	String brand;
	double price;
	boolean haveAirbags;
	long serviceContactNumber;
	
	
	public void weCanTravel() {//general syntax for declaring methods in Java
		System.out.println("Car is a luxury vehicle used for travelling");
	}
	public void rental() {
		System.out.println("Many cars are used for rental purpose");
		
	}
}
