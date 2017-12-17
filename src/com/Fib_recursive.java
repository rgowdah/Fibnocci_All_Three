package com;

public class Fib_recursive {
	public int fib(int n){
		if(n<2){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
public static void main(String[] args) {
	Fib_recursive fib_recursive=new Fib_recursive();
	System.out.println(fib_recursive.fib(10));
}
}
