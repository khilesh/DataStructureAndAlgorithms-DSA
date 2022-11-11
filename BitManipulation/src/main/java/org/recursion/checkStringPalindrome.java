package org.recursion;

public class checkStringPalindrome {

public static void main(String[] args){
	System.out.println("Hello World");
	
	//String sample = "My name is lakhan";
	
	String sample = "abc"; //"racecar";
	
	//System.out.println("Check palindrome :: " + isPalindrome(sample, 0, sample.length() -1));
	
	//System.out.println("Check palindrome :: "  + printPowerSet(sample, 0, ""));
	
	//printPowerSet(sample, 0, "");
	
	printPermutation(sample, "");
}

/***WRONG LOGIC**/
/*
public static boolean checkForPalindrome(String input){
	
	int size = input.length();
	
	if(input[size/2] == input[size -1])
	
	return false;
} */

public static boolean isPalindrome(String input, int startIndex, int endIndex){
	
	if(startIndex == endIndex) {return true;}
	
	if(input.charAt(startIndex) != input.charAt(endIndex)) { return false;}
	
	else return isPalindrome(input, startIndex+1, endIndex-1);
	
}

/***** WRONG APPROACH
public static int printPowerSet(String input, int startIndex, String subSet){
	
	if(startIndex >= input.length()) { System.out.println(" Current String " + subSet);}
	
	printPowerSet(input, startIndex+1, subSet );
	printPowerSet(input, startIndex+1, input.substring(0, startIndex+1) );
	return 0;
}
 ****/

/**
 * input: Input String
 * current is current subset string
 * startIndex is Index in current substring
 */

public static void  printPowerSet(String input, int startIndex, String current){

	int n = input.length();
	
	if(startIndex == n) { return ;} // Base case
	
	System.out.println("Current :: " +current);
	
	for(int i=startIndex+1; i< n; i++){
		current += input.charAt(i);
		printPowerSet(input, i, current);
		current = current.substring(0, current.length()-1);
	
	}
}
/**
 * function to print all the permutations of str
 */
public static void printPermutation(String input, String ans){
	if(input.length() ==0){
		System.out.println( ans + "");
		return ;
	}
	for(int i=0; i<input.length(); i++){
		char ch = input.charAt(i);
		String restOfString = input.substring(0,i) + input.substring(i+1);
		
		printPermutation(restOfString, ans + ch);
	}
}
}
