package com.connor.bigboi;

public class Runner {
	public static void main(String[] args) {
		Person connor = new Person("Connor", "Software Apprentice", 24, 165, 7);
		Person josh = new Person("Josh", "Stock Broker", 46, 192, 11);
		
		Person raheem = new Person("Raheem", 186);
		
		Person lindsey = new Person("Lindsey", "Singer", 22, 156, 4);
		Person stirling = new Person("Stirling", "Singer", 22, 150, 5);
		
		
		connor.greetAll();
		lindsey.greetPartial();
		raheem.greetSmall();
		
		stirling.greetAll();
		josh.greetSmall();
		lindsey.greetPartial();
	}
}
