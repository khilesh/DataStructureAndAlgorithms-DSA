package org.recursion;

public class power {

public static void main(String [] args) {
	System.out.println("hello world find Power " +findPower(4,5));
	System.out.println("hello world find factorial " +findfactorial(10));
	System.out.println("hello world find Sum of fibonnacci " +findSumOffibonnacci(10));
}

public static int findPower(int a, int b){
	
	if(b ==0) {return 1;}
	else return a*findPower(a,b-1);
}

public static int findfactorial(int x){
	if(x==0 || x==1) return 1;
	else return x*findfactorial(x-1);
}

public static int findSumOffibonnacci(int y){
	if( y==1 ||y ==2) return 1;
	else return findSumOffibonnacci(y-1) + findSumOffibonnacci(y-2);
}
}
