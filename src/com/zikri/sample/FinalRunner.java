package com.zikri.sample;

public class FinalRunner {

	public static void main(String[] args) {
		
		FinalClass.sayHi("Java");
		
		FinalClass obj = new FinalClass();
		FinalClass obj2 = new FinalClass();
		
		obj.sayHi("Java");
		obj.sayBye("Java");
		System.out.println(obj.className);
		System.out.println(obj.className2);
		
		//Modifying the data
		obj.className = "MyClass1";
		obj.className2 = "MyClass1";
		
		obj2.className = "MyClass2";
		obj2.className2 = "MyClass2";
		
		
		
		//Printing modified data
		
		System.out.println("Modified 1: " + obj.className);
		System.out.println("Modified 1: " + obj.className2);
		
		System.out.println("Modified 2: " + obj2.className);
		System.out.println("Modified 2: " + obj2.className2);
		
		
		

	}

}
