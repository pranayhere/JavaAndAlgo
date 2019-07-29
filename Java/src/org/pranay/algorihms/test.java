package org.pranay.algorihms;

public class test {
	static class Base {
		public int i = 10;
		public int info() {
			return i;
		}
	}
	
	static class Derived extends Base {
		public int i = 20;
		public int info() {
			return i;
		}
	}
	
	public static void main(String[] args) {
		Base b = new Derived();
		System.out.println(b.i+" "+b.info());
	}
}
