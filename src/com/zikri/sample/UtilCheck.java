package com.zikri.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List list = new ArrayList();
		
		//list.add(new FinalClass());
		
		list.add("Hello");
		
		String s = (String) list.get(0);
		
		*/
		
		List <String> list = new ArrayList <String>();
		
		list.add("Hello");
		list.add("I");
		list.add("am");
		list.add("Java");
		list.add("ArrayList");
		
		//list.add(new FinalClass());
		
		//String s = list.get(0);
		
		/*for( String s : list)
		{
		System.out.print(s + " ");
		}*/
		
		
		/*
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}*/
		
		for(Iterator<?> it = list.iterator();it.hasNext();)
{
			String s = (String) it.next();
			
			if(s.equals("Java"))
			{
				System.out.print("I got: " + s);
			}
}
}
		
		
	}

}
