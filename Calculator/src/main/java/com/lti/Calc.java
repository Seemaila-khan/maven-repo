package com.lti;

public class Calc {
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static int subs(int n1, int n2) {
		return n1 - n2;
	}
	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static void main(String[] args) {
		System.out.println("sum =" + add(10, 20));
		System.out.println("sub =" + subs(10, 20));
		System.out.println("prod =" + mul(10, 20));
	}

}
