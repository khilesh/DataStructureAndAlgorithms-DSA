package org.mathematics;

public class factorial {

public static void main(String [] args){
	
	System.out.println("Hello World");
	System.out.println("Hello World :::" + simpleFactorial(15));
}


public static  int simpleFactorial(int n){
	
	if(n==0)
		return 1;
	else return n*simpleFactorial(n-1);
	/**
	if(n!=0)
		return n*simpleFactorial(n-1);
	else return 1; **/
}

}
