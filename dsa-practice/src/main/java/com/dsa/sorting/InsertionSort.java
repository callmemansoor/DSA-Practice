package com.dsa.sorting;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {

		if (arr.length <= 1) {
			return arr;
		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		return arr;

	}

}
