package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		double tester = 0, diff = 0, temp = 0;
		double price = itemPrice();
		double tendered = amountTendered();
		diff = tendered - price;
		
		String firstResponse = priceDifference(diff);
		System.out.println(firstResponse);

		while(diff > 0) {
		System.out.println("Tens: " + ten(diff));
		diff = diff - ten(diff) * 10;
		
		System.out.println("Fives: " + five(diff));
		diff = diff - five(diff) * 5;
		
		System.out.println("Dollars: " + dollar(diff));
		diff = diff - dollar(diff) * 1;
		
		System.out.println("Quarters: " + quarter(diff));
		diff = diff - quarter(diff) * 0.25;
		
		System.out.println("Dimes: " + dime(diff));
		diff = diff - dime(diff) * 0.1;
		
		System.out.println("Nickles: " + nickle(diff));
		diff = diff - nickle(diff) * 0.05;
		
		System.out.println("Pennies: " + penny(diff));
		diff = diff - penny(diff) * 0.01;
		}

		// int[] testArray = { 1, 2, 3, 4, 5, 6 };
		// arrayTest(testArray);
		// change(12.23);

		// System.out.println(itemPrice());
		// System.out.println(amountTendered());

	}

	public static String priceDifference(double diff) {
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

	public static double itemPrice() {
		System.out.print("Please enter the item price: ");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		return price;
	}

	public static double amountTendered() {
		System.out.print("Please enter the amount tendered: ");
		Scanner input = new Scanner(System.in);
		double tendered = input.nextDouble();
		return tendered;
	}

	public static int ten(double diff) {
		double temp = diff % 10;
		int ten = (int) ((diff - temp) / 10);
		diff = diff - (ten * 10);
		return ten;
	}

	public static int five(double diff) {
		double temp = diff % 5;
		int five = (int) ((diff - temp) / 5);
		diff = diff - (five * 5);
		return five;
	}

	public static int dollar(double diff) {
		double temp = diff % 1;
		int dollar = (int) ((diff - temp) / 1);
		diff = diff - (dollar * 1);
		return dollar;
	}

	public static int quarter(double diff) {
		double temp = diff % 0.25;
		int quarter = (int) ((diff - temp) / 0.25);
		diff = diff - (quarter * 0.25);
		return quarter;
	}

	public static int dime(double diff) {
		double temp = diff % 0.1;
		int dime = (int) ((diff - temp) / 0.1);
		diff = diff - (dime * 0.1);
		return dime;
	}

	public static int nickle(double diff) {
		double temp = diff % 0.05;
		int nickle = (int) ((diff - temp) / 0.05);
		diff = diff - (nickle * 0.05);
		return nickle;
	}

	public static int penny(double diff) {
		double temp = diff % 0.01;
		
		int penny = (int) (1 + ((diff - temp) / 0.01));
		diff = diff - (penny * 0.01);
		return penny;
	}

	public static void arrayTest(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
