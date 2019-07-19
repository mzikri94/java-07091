package com.zikri.sample;

public class ThreadTest extends Thread {
	
	//@Override
	public void run()
	{
		try{
			
		long l = (long) (Math.random() * 100);
		System.out.println("I am new Thread " + this.getName() + " Running :" + l);
		Thread.sleep(1000);
		System.out.println(this.getName() + " I Just go up : " + l);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t1 = new ThreadTest();
		t1.setPriority(MIN_PRIORITY);
		ThreadTest t2 = new ThreadTest();
		t2.setPriority(NORM_PRIORITY);
		ThreadTest t3 = new ThreadTest();
		t3.setPriority(MAX_PRIORITY);
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
