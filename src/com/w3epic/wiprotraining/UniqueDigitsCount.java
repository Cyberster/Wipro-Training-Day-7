package com.w3epic.wiprotraining;

public class UniqueDigitsCount {
	public static int getUniqueDigitsCount(int input1) {
		int number = input1;
		int digitCount = 0;
		boolean[] uniqueness = {false, false, false, false, false, false, false, false, false, false};
		
		while (number != 0) {
			int digit = number % 10;
			
			if (uniqueness[digit] == false) {
				uniqueness[digit] = true;
				digitCount++;
			}
			
			number /= 10;
		}
		
		return digitCount;
	}
}
