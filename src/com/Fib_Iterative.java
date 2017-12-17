package com;

public class Fib_Iterative {
	public int fib(int n){
		int i=0,j=1;
		for (int k = 0; k < n; k++) {
			i=j-i;
			j=i+j;
		}
		return i;
	}
public static void main(String[] args) {
	Fib_Iterative fib_Iterative=new Fib_Iterative();
	System.out.println(fib_Iterative.fib(10));
}
}
