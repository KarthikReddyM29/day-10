package com.codegnan.controlstatements;
import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
		double cost;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of units used");
		int units = sc.nextInt();
		System.out.println("enter senior citizen or not");
		String seniorInput = sc.next();
		boolean isSenior = seniorInput.equalsIgnoreCase("yes")||seniorInput.equalsIgnoreCase("y");
		if (units>=0 && units<=100) {
			cost = units*1.50;
			System.out.println("your bill :" +cost);
		}else {
			if(units>=101 && units<=200) {
				cost = (units-100)*2.0+100*1.5;
				System.out.println("your bill :" +cost);
			}else {
				if(units>=201 && units<=300) {
					cost = (units-200)*3.0+(100*1.5)+(100*2.0);
					System.out.println("your bill :" +cost);
				}else {
						cost = (units-300)*5.0+(100*1.5)+(100*2.0)+(100*3.0);
						System.out.println("your bill :" +cost);
				}
			}
		}if(cost>1000) {
			cost*=0.90;
			System.out.println(cost);
		}else {
			System.out.println(cost);
		}
	if(isSenior) {
		cost*=0.95;
		System.out.println("your bill :" +cost);
	}else {
		System.out.println("your bill :" +cost);
	}

}
}
