package org.recursion;

public class start {

public static void main(String[] args){
	System.out.println("Hello World from main" + infiniteRecursion(65));
	
}

public static int infiniteRecursion(int n){
	
	if(n ==0){ return -1;}
	System.out.println(" Hello world from method " + n + ":::" + infiniteRecursion(n-1));
	
	return  0;
}
}
