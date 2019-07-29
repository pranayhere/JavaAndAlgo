package org.pranay.algorihms;

class A {
	public A() {
		System.out.println("In A");
	}
}
class B extends A {
	public B() {
		System.out.println("In B");
	}
}
public class test2 {
	public static void main(String[] args) {
		A a = new B();
	}
}
