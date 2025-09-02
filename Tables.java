package com.codegnan.controlstatements;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		int table = 0;
		for(int i=0 ;i<=20;i++) {
			table=num*i;
			System.out.println(num +"*"+i+"="+table );
		}
		sc.close();
	}
}
