package Buzz;

import java.util.Arrays;

public class FizzBuzz {
private int[] numbers;
	
	public int[] getNumbers() {
		numbers = new int[100];
		for(int i = 0; i< numbers.length; i++) {
			numbers[i]=i+1;
		}
		return numbers;
	}
	public String fizzbuzz(int value) {
		 if (value % 3 == 0 || value % 5 == 0) {
			if (value % 3 == 0 && value % 5 == 0) {
				return "fizzbuzz";
			} else if (value % 3 == 0) {
				return "fizz";
			} else if (value % 5 == 0) {
				return "buzz";
			}
		} else {
			return Integer.toString(value);
		}
			return "";
	}
}