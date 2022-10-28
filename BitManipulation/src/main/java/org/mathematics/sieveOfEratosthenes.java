package org.mathematics;

import java.util.Arrays;

/** Sieve Of Eratosthenes
 * If N is Prime then
 * from 1 to squareRootOf(N) there are NO factors of N;
 * 1 is not included and squareRootOf(N) is included
 * **/

public class sieveOfEratosthenes {

public static void main(String [] args){
	System.out.println(" Hello World" + eratosthenes(12) );
	
	boolean isPrime[] = eratosthenes(12);
	for(int i=0; i<=12; i++) {
		System.out.println(i + " " + isPrime[i]);
	}
}

public static boolean[] eratosthenes(int n){
boolean isPrime[] = new boolean[n+1];
	Arrays.fill(isPrime, true);
isPrime[0] = false;
isPrime[1] = false;

for(int i=2; i*i <=n; i++) {
	for(int j = 2*i; j<=n; j+=i){
		isPrime[j] = false;
	}
}

return isPrime;
}

}
