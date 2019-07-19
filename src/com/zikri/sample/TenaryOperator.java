package com.zikri.sample;

public class TenaryOperator
{
	public static void main(String args[])
	{
		String strInput = "";
		try{
		strInput = args[0];
		System.out.println(strInput instanceof String);
		int input = Integer.parseInt(strInput);
		int target = 0;

		/*if(input > 10)
		{
			target = 10;
		}
		else
		{
			target = input;
		}*/
		target = (input > 10)?10 : input;


		outer: for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if (j>i)
				{
					System.out.println("L");
					continue outer;
				}
				System.out.print(" " + (i *j));
			}
		}

		System.out.println();
		
		int num = 10;
		
		int result = num / input;
		
		System.out.println("Result : " + result);
	} 
		catch(NumberFormatException ex)
		{
			System.out.println("I Guess you didn't give me a number : " + strInput);
			System.out.println();
			//ex.printStackTrace();
		}
		
		catch(Exception ex)
		{
			System.out.println("I don't know, something is wrong");
			System.out.println();
			ex.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally It's Done");
		}
	}
}