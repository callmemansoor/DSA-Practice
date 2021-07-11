package com.dsa.sorting;

public class SelectionSort {
	
	static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int index = i;
			for(int j=i; j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}

}
