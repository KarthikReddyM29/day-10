package com.codegnan.controlstatements;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		long result = 1;
		for(int i=1 ; i<=num; i++) {
			result=result*i;
		}
		System.out.println("factorial of: "+ num +" is " + result);
	}

}
