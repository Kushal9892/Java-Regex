package com.niit.kushal.regex;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleIP {
 
      public static void main(String[] args) {
 
            System.out.println("Enter multiple IPs in the Input seperated by a comma :");
            Scanner sc = new Scanner(System.in);
 
            String input = sc.nextLine();
 
            System.out.println(input);
 
            validate(input);
 
      }
 
      public static void validate(String input) {
 
            //String ipAddress = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
            String ipAddress = "^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])/?([0-9]|[1-2][0-9]|3[0-1])?)$";
            Pattern p = Pattern.compile(ipAddress);
            Matcher m;
 
            StringTokenizer token = new StringTokenizer(input, ",");
            //System.out.println(token.toString());
            
            int j, k = 0;
            j = token.countTokens();
 
            String[] ip = new String[j];
            //System.out.println(token.nextToken());
 
            while (token.hasMoreTokens()) {
 
                  ip[k] = token.nextToken();
                  k++;
            }
 
            for (int i = 0; i < k; i++) {
 
                  m = p.matcher(ip[i]);
                  
 
                  if (m.find()) {
 
                        System.out.println(ip[i] + " is valid");
                  } else {
                        System.out.println(ip[i] + " is not  valid ");
                  }
            }
      }
 
}