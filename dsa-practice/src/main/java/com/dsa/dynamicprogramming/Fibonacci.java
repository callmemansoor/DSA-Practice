package com.dsa.dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		int[] arr = new int[11];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		int fib = fib(arr.length, arr);
		System.out.println(fib);
	}

	private static int fib(int n, int[] arr) {
		if (arr[n - 1] != -1) {
			return arr[n - 1];
		}

		if (n <= 2) {
			return 1;
		}
		arr[n - 1] = fib(n - 1, arr) + fib(n - 2, arr);
		return arr[n - 1];
	}
}
