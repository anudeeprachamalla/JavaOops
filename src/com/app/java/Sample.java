package com.app.java;

public class Sample {

	void m1() {
		System.out.println("vaagdevi eng clg");
	}

	void m2() {
		System.out.println("ganapthy eng clg");
	}

	void m3() {
		m2();
		m1();
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m3();

	}
}
