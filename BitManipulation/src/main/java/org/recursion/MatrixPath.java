package org.recursion;
/**
 * Problem Statement: Given a m*n matrix, find the number of
 * possible paths from the top left cell of the matrix to its
 * last bottom right cell.
 * We are allowed to move forward or downward - upward or diagonal not allowed.
 *
 * **/

public class MatrixPath {

public static void main(String [] args){
	System.out.println("Hello World");
	System.out.println("Find number of paths " + numberOfMatrixPaths(6,4));
}

public static int numberOfMatrixPaths(int m, int n){
	if(m ==1 || n ==1){ return 1;}
	else return numberOfMatrixPaths(m-1, n) + numberOfMatrixPaths(m, n-1);
}

}
