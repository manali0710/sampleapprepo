package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {

		System.out.println("Hello from STS");
		show();
	}

	public static void show() {
		int[] arr= {12,56,34,89};
		for(int i=0; i<100; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Show here!");
	}
}
