package com.niit.kushal.regex;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IPDemo {
	
	public void validate(String input) {

		
		String IPPatterns = "^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])/?([0-9]|[1-2][0-9]|3[0-1])?)$";
		Pattern p=Pattern.compile(IPPatterns);
		
//		StringTokenizer st = new StringTokenizer(input,",");
//		while (st.hasMoreTokens()) {
//			String[] token = st.nextToken();
//			System.out.println(st.nextToken());
//		}
		Matcher m = p.matcher(input);

		if (m.find()) {
			System.out.println(input + " is a valid IP address ");
		}

		else {
			System.out.println(input + " is not a valid IP address ");
		}

		// public boolean validate(final String ip){
		// matcher = pattern.matcher(ip);
		// return matcher.matches();
		
		// |((http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*([.][a-zA-z]+)+
		
		// |/([0-9]|[1-2][0-9]|3[0-1])
		
		// working - "^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$"

	}

}
