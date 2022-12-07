package com.project.car;

public class Tester {
	public static void main(String[] args) {
		Car car=new Car();//creation of the object
		//initialization of values by using object reference
		car.slNo=100;
		car.name="Swift";
		car.colour="White";
		car.brand="Hyundai";
		car.price=500000;
		car.haveAirbags=false;
		car.serviceContactNumber=9876766668l;
		car.weCanTravel();
		car.rental();
		System.out.println("Sl.no: "+car.slNo);
		System.out.println("Name: "+car.name);
		System.out.println("Color: "+car.colour);
		System.out.println("Brand: "+car.brand);
		System.out.println("Price: "+car.price);
		System.out.println("Are there AirBags: "+car.haveAirbags);
		System.out.println("Service ContactNumber: "+car.serviceContactNumber);
		
	}

}
