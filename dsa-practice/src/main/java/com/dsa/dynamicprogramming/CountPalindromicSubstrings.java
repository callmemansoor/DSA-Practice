package com.dsa.dynamicprogramming;

public class CountPalindromicSubstrings {

	public static void main(String[] args) {

		String str = "abccbc";
		System.out.println("Count of pallindromic sub strings are : " + countPallindromicSubstring(str));

	}

	static int countPallindromicSubstring(String str) {
		int count = 0;
		int strLength = str.length();
		boolean[][] dp = new boolean[strLength][strLength];

		for (int diagnol = 0; diagnol < strLength; diagnol++) {

			for (int row = 0, col = diagnol; col < dp.length; row++, col++) {

				if (diagnol == 0) {
					dp[row][col] = true;
				} else if (diagnol == 1) {
					dp[row][col] = str.charAt(row) == str.charAt(col);
				} else {
					dp[row][col] = str.charAt(row) == str.charAt(col) && dp[row + 1][col - 1] == true;
				}

				if (dp[row][col] == true) {
					count++;
				}
			}

		}

		return count;
	}
}
