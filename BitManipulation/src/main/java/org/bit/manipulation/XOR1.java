package org.bit.manipulation;

public class XOR1 {

static final int INT_SIZE = 32;




/**
 * Problem statement: find the only non-repeating element in an array where every element repeats twice
 * Assumption: there is ONLY ONE non-repeating element in the input Array
 * *****/

public static int onlyNonRepeatingElement(int[] input){
	
	int result =0;
	
	for(int i=0; i< input.length; i++){
		
		result = input[i]^result;
	}
	
	return  result;
	
	
}

/**
 * Problem Statement: Given an array where every element occurs three times, except one element which occurs only once.
 * Find the element that occurs once
 *
 *


static int getSingle(int arr[], int n)
{
	int result = 0;
	int x, sum;
	
	// Iterate through every bit
	for (int i = 0; i < INT_SIZE; i++) {
		// Find sum of set bits at ith position in all array elements
		sum = 0;
		x = (1 << i);
		for (int j = 0; j < n; j++) {
			if ((arr[j] & x) != 0)
				sum++;
		}
		// The bits with sum not multiple of 3, are the bits of element with single occurrence.
		if ((sum % 3) != 0)
			result |= x;
	}
	return result;
} **/


/**
 * I like to think about the number in 32 bits and just count how many 1s are there in each bit, and sum %= 3 will clear it once it reaches 3.
 * After running for all the numbers for each bit, if we have a 1, then that 1 belongs to the single number, we can simply move it back to its spot by doing
 * ans |= sum << i;
 *
 * This has complexity of O(32n), which is essentially O(n) and very easy to think and implement. Plus, you get a general solution for any times of occurrence.
 * Say all the numbers have 5 times, just do sum %= 5.
 * ****/


public static int singleNumber(int[] nums) {
	int ans = 0;
	for(int i = 0; i < 32; i++) {
		int sum = 0;
		for(int j = 0; j < nums.length; j++) {
			if(((nums[j] >> i) & 1) == 1) {
				sum++;
				sum %= 3;
			}
		}
		if(sum != 0) {
			ans |= sum << i;
		}
	}
	return ans;
}

public static void main (String[] args){
	
	
	
	int intOne = 1;
	int intTwo = 2;
	
	String stringOne = "1";
	String stringTwo = "2";
	
	System.out.println("Hellow World " + (intOne ^ intTwo));
	
	System.out.println("Hello  World " + (Integer.parseInt(stringOne) ^ Integer.parseInt( stringTwo)));
	
	int[] inputArray = {5,3,4,2,2,6,4,3,5};
	int[] inputArray2 = {5,3,5,3,12,3,5};
	System.out.println("onlyNonRepeatingElement ::: " + onlyNonRepeatingElement(inputArray));
	
	//System.out.println("onlyNonRepeatingElement where every element occurs three times ::: " + getSingle(inputArray2, 3));
	
	System.out.println("onlyNonRepeatingElement where every element occurs three times ::: " + singleNumber(inputArray2));
	
	
	
}
}
