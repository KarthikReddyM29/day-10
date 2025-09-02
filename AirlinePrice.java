package com.codegnan.controlstatements;
import java.util.Scanner;
public class AirlinePrice {

	public static void main(String[] args) {
		final int basePrice = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter passenger type(child/adult/senior) ");
		String type = sc.next();
		System.out.println("enter time(early/normal/last minute");
		String time = sc.next();
		int price = basePrice;
		if(type.equalsIgnoreCase("child")) {
			price*=0.5;
			System.out.println("discount amount for child :" +price);
		}else {
			if(type.equalsIgnoreCase("senior")) {
				price*=0.80;
				System.out.println("iscount amount for senior :" +price);
			}else {
				if(type.equalsIgnoreCase("adult")) {
					System.out.println("no discount" +price);
					return;
				}else {
					System.out.println("wrong choice");
				}
			}
		}
		if(time.equalsIgnoreCase("early")) {
			price*=0.90;
			System.out.println("discount"+price);
		}else {
			if(time.equalsIgnoreCase("normal")) {
				System.out.println("no diacount" +price);
			}else {
				if (time.equalsIgnoreCase("last minute" )) {
					price*=1.2;
					System.out.println("plus 20 percent" +price);
				}else {
					System.out.println("enter correct option");
					return;
				}
			}
		}
		

	}

}
