package org.mathematics;

/*** Modular Arithmetic
 (a+b) %n = (a%n + b%n) %n
 (a +b ) %n = (a%n + b%n) %n
 (a +b ) %n = (a%n + b%n) %n
 
 a^b = (a^2) ^ (b/2) = (a*a) ^ (b/2)  -- if b is even
 a^b = a*a^(b-1) --- if b is even.
 
**/
public class ModuloArithmetic {


public static void main (String [] args){
	
	System.out.println("fastPower     ::: " + fastPower(39784,5));
	System.out.println("longFastPower ::: " + longFastPower(397843,5));
	System.out.println("modFastPower  ::: " + modFastPower(397843,5,7));
	
}

//Calculating a^b where a& b are int
public static int fastPower(int a, int b){
int result =1;
while(b>0)  {
			if((b&1) !=0){  // b is odd
				result = result * a;
			}
			a= a*a;   //b is even
			b = b >>1;
}
	return result;
}

//Calculating a^b where a& b are long
public static long longFastPower(long a, long b){
	long result =1;
	
	while(b>0){
		if((b&1)!=0) {// b is odd
			result = result * a;
		}
		a = a*a;
		b = b >>1;
	}
	return result;
}

//  Calculating (x^y) %z
public static long modFastPower(long x, long y, int z){
	long result = 1;
	while(y >0){
		if((y&1)!=0){
			//result = ((result%z) * (y%z))%z;  // (result%z)%z = result%z
			result = ((result) *(y%z) )%z;
		}
		x = ((x%z)* (x%z))%z;
		y = y >>1;
	}
	
	return result;
}
}
