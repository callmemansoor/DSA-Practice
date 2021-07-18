package com.dsa.dynamicprogramming;

public class LongestPalindromicSubstrings {

	public static void main(String[] args) {

		String str = "abccbcddcddcd";
		System.out.println("Longest pallindromic sub string is : " + longestPallindromicSubstring(str));

	}

	static String longestPallindromicSubstring(String str) {
		String longestPal = "";
		int strLength = str.length();
		boolean[][] dp = new boolean[strLength][strLength];
		int start = -1;
		int end = -1;

		for (int diagonal = 0; diagonal < strLength; diagonal++) {
			for (int row = 0, col = diagonal; col < dp.length; row++, col++) {

				if (diagonal == 0) {
					dp[row][col] = true;
				} else if (diagonal == 1) {
					dp[row][col] = str.charAt(row) == str.charAt(col);
				} else {
					dp[row][col] = str.charAt(row) == str.charAt(col) && dp[row + 1][col - 1] == true;
				}

				if (dp[row][col] == true) {
					start = row;
					end = col;
				}
			}

		}

		if (start != -1 && end != -1) {
			return str.substring(start, end + 1);
		}

		return longestPal;
	}
}
