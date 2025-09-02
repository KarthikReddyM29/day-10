package com.codegnan.controlstatements;
import java.util.Scanner;
public class ReverceNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int reversedNum = 0;
		int ori = num;
		while (num != 0) {
			int reminder = num%10;
			reversedNum = reversedNum*10+reminder;
			num = num/10;
		}
		System.out.println("Reverse of a number "+ori+" is "+reversedNum );
	}

}
