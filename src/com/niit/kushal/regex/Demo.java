package com.niit.kushal.regex;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Enter the IP");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		
		IPDemo ipd = new IPDemo();
		ipd.validate(input);
	}
}
	
	
