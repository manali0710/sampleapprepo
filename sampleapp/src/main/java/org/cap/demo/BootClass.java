package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {

		System.out.println("Hello from STS");
		show();
	}

	public static void show() {
		int[] arr= {12,56,34,89};
		int sum=0;
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
		}
			
		System.out.println("Show here!");
	}
}
