package com.ampu.practice.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		int n = 5;
		for (int i=0; i<n ; i++) {
			ThreadOne t1 = new ThreadOne();
			t1.start();
			
			Thread t2 = new Thread(new ThreadOne());
			t2.start();
			
			Thread t3 = new Thread (new ThreadTwo());
			t3.run();
		}

	}

}
