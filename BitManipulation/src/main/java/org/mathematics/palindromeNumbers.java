package org.mathematics;

public class palindromeNumbers {




public static void main(String [] args){
	
	System.out.println(" racecar is a palindrome :::" + 5832%10000);
	System.out.println(" racecar is a palindrome :::" + findPalindromeInt(1404));
	
}

public static int findPalindromeInt(int input){
	int r, sum=0, temp =0;
	//if(input >= 0 || input <= 9 ) return input;
	
	temp = input;
	while (input >0){
		sum = (sum*10) + input%10;
		input = input/10;
	}
	
	
	return sum;
}

}
