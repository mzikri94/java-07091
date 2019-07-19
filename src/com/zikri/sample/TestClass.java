package com.zikri.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		System.out.println("I am TestClass");
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test It");

	}
	
	public static void main(String args[])
	{
		System.out.println("Inside TestClass Main");
		System.out.println(name);
		//name = "New Name";
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(Inf2.name);
		
		Inf2 obj = new TestClass();
		System.out.println(obj.whoAmI());
		//System.out.println(obj.whoAmI());
		obj.testIt();
	}

}
