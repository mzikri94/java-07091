package com.zikri.sample;

public class MyClass {
	
	public void displayMessage(Message m)
	{
		System.out.println(m.greet());
	}
	
	public static void main(String[] args)
	{
		//instantianting the outer class
		Outer_Class outer = new Outer_Class();
		
		//Acessing the display_Inner() method
		outer.display_Inner();
		
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		
		//Pass anonymous inner class as a parameter
		
		MyClass obj = new MyClass();
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		
		});
			
		}
}

		
		
	


