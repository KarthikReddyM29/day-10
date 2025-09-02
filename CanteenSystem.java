package com.codegnan.controlstatements;
import java.util.Scanner;
public class CanteenSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teaPrice = 10 , coffeePrice = 15 , samosaPrice = 20;
		int teaQty = 0 , coffeeQty = 0 , samosaQty = 0;
		int choice ;
		double taxRate = 0.05;
		do {
			System.out.println("=============canteen menu============");
			System.out.println("===========1.view menu=============");
			System.out.println("==============2.order items==========");
			System.out.println("================3.view bill========");
			System.out.println("==========4.checkout & exit=======");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("------menu------");
				System.out.println("1.tea - " + teaPrice);
				System.out.println("2.coffee-" + coffeePrice);
				System.out.println("3.samosa-" + samosaPrice);
				break;
			case 2:
				System.out.println("enter item no to order (1-3)");
				int item = sc.nextInt();
				System.out.println("enter quantity");
				int qty = sc.nextInt();
				if(qty<=0) {
					System.out.println("Quantity must be >0");
					break;
				}
				switch(item) {
				case 1:
					teaQty+=qty;
					System.out.println(qty +"tea(s) added");
					break;
				case 2:
					coffeeQty+=qty;
					System.out.println(qty +"coffee(s) added");
					break;
				case 3:
					samosaQty+=qty;
					System.out.println(qty +"samosa(s) added");
					break;
					default:
						System.out.println("invalid item no pls choose b/t (1-3)");
						break;
				}
				break;
			case 3:
				int teaTotal = teaQty*teaPrice;
				int coffeeTotal = coffeeQty*coffeePrice;
				int samosaTotal = samosaQty*samosaPrice;
				int subTotal = teaTotal+coffeeTotal+samosaTotal;
				double tax=subTotal*taxRate;
				double grandTotal=subTotal+tax;
				System.out.println("=============bill============");
				if(teaQty>0) {
					System.out.println("tea x " + teaQty +" $" + teaTotal);
				}if(coffeeQty>0) {
					System.out.println("coffee x " + coffeeQty +" $" + coffeeTotal);
				}if(samosaQty>0) {
					System.out.println("samosa x " + samosaQty +" $" + samosaTotal);
				}if(subTotal == 0) {
					System.out.println("no items ordered");
				}else {
					System.out.println("subtotal = " + subTotal);
					System.out.println("tax(%5) = "+ tax);
					System.out.println("Grand total " +grandTotal);
				}
				break;
			case 4:
				System.out.println("thank you existing system");
				break;
				default:
					System.out.println("inavalid choice please enter a no (1-4)");
					break;
			}
		}while(choice != 4);
		sc.close();
	}
}