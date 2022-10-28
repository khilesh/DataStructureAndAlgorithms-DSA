package org.bit.manipulation;

public class ShiftOperators {

public static void main(String [] args){
	
	System.out.println("Hello World");
	
	
	System.out.println("Hello World ::: " + checkForEven(61));
	System.out.println("Hello World ::: rightShiftOperator " + rightShiftOperator(61));
	System.out.println("Hello World ::: leftShiftOperator  " + leftShiftOperator(61));
}

public static boolean checkForEven(int x){
	// if (x%2 ==0 ) return true; else return false;
	// return (x%2 ==0)?true:false;  // Mod is expensive so should be avoided
	return ((x&1) ==0)?true:false; // Bit operators to be used, last bit is 1
	// so "&" with 1 will 1 for odd numbers
	
}

public static int rightShiftOperator(int y){
	return y>>1;
}

public static int leftShiftOperator(int z){
	return z<<1;
}
}
