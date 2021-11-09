package com.connor.bigboi;

public class Person {
	
	private String name;
	private String jobTitle;
	private int age;
	private double height;
	private int shoeSize;

	
	public Person(String name, String jobTitle, int age, double height, int shoeSize) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
	}
	

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}


	public void greetAll() {
		System.out.println("Hello! My name is " + name + ".");
		System.out.println("I am a " + age + " year old " + jobTitle + ".");
		System.out.println("I am " + height + "cm, and my shoe size is " + shoeSize + ".");
	}
	
	public void greetPartial() {
		System.out.println("Hi! I'm " + name + ", and I'm " + height + " cm tall");
	}
	
	public void greetSmall() {
		System.out.println("Uh... I'm " + height + "cm, and my name is " + name + ".");
	}
}
