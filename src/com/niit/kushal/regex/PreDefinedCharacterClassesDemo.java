package com.niit.kushal.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClassesDemo {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\s"); // To search for space character
		//Pattern p = Pattern.compile("\\S"); // Except space character
		//Pattern p = Pattern.compile("\\d"); // To search for any digit from 0-9
		//Pattern p = Pattern.compile("\\D"); // Except digits
		//Pattern p = Pattern.compile("\\w"); // Any word character [a-zA-Z0-9]
		//Pattern p = Pattern.compile("\\W"); // Except word character (i.e. special character)
		//Pattern p = Pattern.compile("."); 	// Any character 
		Matcher m = p.matcher("");
		
		while(m.find()) {
			
			System.out.println(m.start() + "..." + m.group());
		}

	}

}
