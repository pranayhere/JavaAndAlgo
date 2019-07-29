package org.pranay.algorihms;

public class HelloGoodBye {
	public static void main(String[] args) {
		try {
			System.out.println("hello world");
			System.exit(0);
		}
		finally {
			System.out.println("aaa");
		}
	}
}
