package org.mathematics;


/**
 * Problem statement: Count number of zeros in factorial of number
 */
public class trailingZeros {

public static void main(String [] args){

	System.out.println("Hello World");
	
	System.out.println("Hello World ::: " + numberOfTrailingZeros(5));
	
	/****
	 * Number of zeros = [n/5] + [n/25] + [n/125] + [n/625] + [n/3125]
	 */
}

public static int numberOfTrailingZeros(int n){
	int result =0;
	
	for (int i=5; i<=n; i=i*5){
	result = result + n/i;
	}
	
	return result;
}
}
