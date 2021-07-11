package com.dsa.sorting;

public class SortingAlgosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] sortArr = new int[] { 56, 10, 25, 63, 14, 98, 110, 26, 30, 1, 6 };

		int[] selectionSortedArray = new SelectionSort().sort(sortArr);

		int[] insertionSortedArray = new InsertionSort().sort(sortArr);
		

		for (int i : insertionSortedArray)
			System.out.print(i + " ");
	}

}