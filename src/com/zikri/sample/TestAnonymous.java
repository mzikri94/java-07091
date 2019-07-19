package com.zikri.sample;

public class TestAnonymous {
	
	public static void main(String[] args)
	{
		AnonymousInner obj = new AnonymousInner()
				{
				@Override
				public void myMethod()
				{
					System.out.println("Inside myMethod()");
				}
				};
		
		obj.myMethod();
	}

}
