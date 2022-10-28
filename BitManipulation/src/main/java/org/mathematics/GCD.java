package org.mathematics;

/**
 * GCD(a,b) = gcd(a-b, b)
 * GCD(a,b) = GCD(b, a%b), while a%b !=0
 * ****/

public class GCD {

public static void main(String[] args0){
	System.out.println(" Finding GCD using Euclid maths :: " + findGCD(60, 24));
	
	
}

public static int findGCD(int a, int b){
	/**if(b ==0) return a;
	return findGCD(b, a%b); **/
	
	return a%b ==0?b : findGCD(b, a%b);
}
}
