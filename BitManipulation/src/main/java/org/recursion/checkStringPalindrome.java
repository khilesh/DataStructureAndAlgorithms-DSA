package org.recursion;

public class checkStringPalindrome {

public static void main(String[] args){
	System.out.println("Hello World");
	
	//String sample = "My name is lakhan";
	
	String sample = "abcba"; //"racecar";
	
	System.out.println("Check palindrome :: " + isPalindrome(sample, 0, sample.length() -1));
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


}
