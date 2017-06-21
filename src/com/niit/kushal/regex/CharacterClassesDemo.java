package com.niit.kushal.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("[abc]"); // search for either ‘a’ or ‘b’ or ‘c’ 
		//Pattern p = Pattern.compile("[^abc]"); // search for except ‘a’ or ‘b’ or ‘c’
		//Pattern p = Pattern.compile("[a-z]"); // search for Any lower case alphabet
		//Pattern p = Pattern.compile("[A-Z]"); // search for Any upper case alphabet
		//Pattern p = Pattern.compile("[a-zA-Z]"); // search any alphabet including upper case or lower case
		//Pattern p = Pattern.compile("[0-9]"); // search for any digit from 0 to 9
		Pattern p = Pattern.compile("[a-zA-Z0-9]"); // search for any alphanumeric characters 
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]"); // search for except alphanumeric character (special characters)
		
		Matcher m = p.matcher("a7b@z#9"); // Target String!!
		
		while(m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
	}

}
