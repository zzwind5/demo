package com.juvenxu.mvnbook;

public class HelloWorld {

	public String sayHello(){
		return "Hello Maven";
	}
	
	public static void main(String[] args){
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.sayHello());
	}
}
