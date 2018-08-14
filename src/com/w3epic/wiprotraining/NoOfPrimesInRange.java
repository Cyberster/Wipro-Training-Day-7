package com.w3epic.wiprotraining;

public class NoOfPrimesInRange {
	public static int getNoOfPrimesInRange(int input1, int input2) {
		int primeCount = 0;
		int number = input1;
		
		while(true) {
			boolean isPrime = true;
			
			for (int i = 2; i < number; i++) {
				if (number % i == 0) isPrime = false;
			}
			
			if (isPrime) {
				//System.out.println("Number: " + number);
				if (number > 1) primeCount++;
			}
			
			number++;
			if (number > input2) break;
		}
		
		return primeCount;
	}
}
