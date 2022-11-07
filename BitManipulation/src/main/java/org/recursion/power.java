package org.recursion;

public class power {

public static void main(String [] args) {
	
	System.out.print("hello world from main " +findPower(4,5));
}

public static int findPower(int a, int b){
	
	if(b ==0) {return 1;}
	else return a*findPower(a,b-1);
}
}
