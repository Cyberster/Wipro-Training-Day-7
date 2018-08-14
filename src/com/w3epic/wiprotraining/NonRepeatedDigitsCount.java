package com.w3epic.wiprotraining;

public class NonRepeatedDigitsCount {
	public static int getNonRepeatedDigitsCount(int input1) {
		int number = input1;
		int digitCount = 0;   // 2 - 9 - 2
		int[] repeateness = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (number != 0) {
			int digit = number % 10;
			repeateness[digit]++;
			number /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			//System.out.print(repeateness[i] + ", ");
			if (repeateness[i] == 1) digitCount++;
		}
		
		return digitCount;
	}
}
