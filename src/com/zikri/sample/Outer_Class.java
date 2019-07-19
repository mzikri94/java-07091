package com.zikri.sample;

class Outer_Class {
	
	int num;
	
	//inner class
	
	private class Inner_Class
	{
		public void print()
		{
			System.out.println("This is an inner class");
		}
	}
	
	public class Inner_Class2
	{
		public void print()
		{
			System.out.println("This is an inner class 2");
		}
	}
	
	void myMethod()
	{
		class Inner_Class3
		{
			public void print()
			{
				System.out.println("This is an Inner Class3 inside myMethod");
			}
			
		}
		
	}
	
	//Acessing he inner class from the method within
	
	void display_Inner()
	{
		Inner_Class inner = new Inner_Class();
		inner.print();
	}

}
