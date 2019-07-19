package com.zikri.sample;

public class TestSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleA obj1 = new SampleA("Java");
		SampleB obj2 = new SampleB();
		
		System.out.println("About to print object..");
		System.out.println(obj1);
		System.out.println(obj2);

		String strObjName = new String(obj1.toString());
		System.out.println("StrObjName: " + strObjName);
		
		SampleA obj3 = new SampleA("Java");
		System.out.println(obj3);
		
		SampleA obj4 = new SampleA("C++");
		
		if(obj1.equals(obj3))
		{
			System.out.println("Both has same name");
		}
		else
		{
			System.out.println("Both are different");
		}
	}

}
