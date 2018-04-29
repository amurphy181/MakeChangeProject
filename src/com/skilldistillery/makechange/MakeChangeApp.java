package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		double temp = 0;
		float tester = 0f; 
		int diff = 0;
		float price = (float)itemPrice();
		float tendered = (float)amountTendered();
		diff = (int)( tendered - price);
		tester = (float)(tendered - price);
//		System.out.println(tester);
//		System.out.println(diff);
		
		
		String firstResponse = priceDifference(diff);
		System.out.println(firstResponse);

		while (diff > 0){
		System.out.println("Tens: " + ten(diff));
		diff = diff - ten(diff) * 1000;
		
		System.out.println("Fives: " + five(diff));
		diff = diff - five(diff) * 500;
		
		System.out.println("Dollars: " + dollar(diff));
		diff = diff - dollar(diff) * 100;
		
		System.out.println("Quarters: " + quarter(diff));
		diff = diff - quarter(diff) * 25;
		
		System.out.println("Dimes: " + dime(diff));
		diff = diff - dime(diff) * 10;
		
		System.out.println("Nickels: " + nickel(diff));
		diff = diff - nickel(diff) * 5;
		
		System.out.println("Pennies: " + penny(diff));
		diff = diff - penny(diff) * 1;
		
		diff = 0;
		}

		// int[] testArray = { 1, 2, 3, 4, 5, 6 };
		// arrayTest(testArray);
		// change(12.23);

		// System.out.println(itemPrice());
		// System.out.println(amountTendered());

	}

	public static String priceDifference(int diff) {
		double difference = diff;
		String response;
		if (difference < 0) {
			response = "The cost of the item is higher than the " + "amount tendered.\n Please insert more money.";
			return response;
		} else if (difference == 0) {
			response = "Exact change! Thank you!";
			return response;
		} else {
			response = "Thank you. Processing payment and returning change.";
			return response;
		}
	}

	public static int itemPrice() {
		System.out.print("Please enter the item price: ");
		Scanner input = new Scanner(System.in);
		int price = (int) (100 *(input.nextDouble()));
		return price;
	}

	public static int amountTendered() {
		System.out.print("Please enter the amount tendered: ");
		Scanner input = new Scanner(System.in);
		int tendered = (int)(100 *(input.nextDouble()));
		return tendered;
	}

	public static int ten(int diff) {
		double temp = diff % 1000;
		int ten = (int) ((diff - temp) / 1000);
		diff = diff - (ten * 1000);
		return ten;
	}

	public static int five(int diff) {
		double temp = diff % 500;
		int five = (int) ((diff - temp) / 500);
		diff = diff - (five * 500);
		return five;
	}

	public static int dollar(int diff) {
		double temp = diff % 100;
		int dollar = (int) ((diff - temp) / 100);
		diff = diff - (dollar * 100);
		return dollar;
	}

	public static int quarter(int diff) {
		double temp = diff % 25;
		int quarter = (int) ((diff - temp) / 25);
		diff = diff - (quarter * 25);
		return quarter;
	}

	public static int dime(int diff) {
		double temp = diff % 10;
		int dime = (int) ((diff - temp) / 10);
		diff = diff - (dime * 10);
		return dime;
	}

	public static int nickel(int diff) {
		double temp = diff % 5;
		int nickel = (int) ((diff - temp) / 5);
		diff = diff - (nickel * 5);
		return nickel;
	}

	public static int penny(int diff) {
		double temp = diff % 1;
		int penny = (int) ((diff - temp) / 1);
		diff = diff - (penny * 1);
		return penny;
		
	}

	public static void arrayTest(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
