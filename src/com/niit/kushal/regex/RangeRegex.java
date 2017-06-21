package com.niit.kushal.regex;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RangeRegex {
 
      private static String s;
 
      public static void main(String[] args) {
            String startIP;
            String endIP;
           
            Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter the startIP : ");
            startIP = sc.nextLine();
            System.out.println("Enter the endIP : ");
            endIP = sc.nextLine();
 
            System.out.println("The Range is : " + startIP + "-" + endIP);
 
            int startIndex = tokenize(startIP);
            System.out.println("startIndex :" + startIndex);
 
            startIP = s;
            System.out.println("startIP value after tokenize function : " + startIP);
            int endIndex = tokenize(endIP);
            System.out.println("endIndex :" + endIndex);
            endIP = s;
            System.out.println("endIP value after tokenize function : " + endIP);
            String ipAddress = "";
 
            if (startIP.equals(endIP)) {
 
                  for (int i = startIndex; i < endIndex; i++) {
 
                        ipAddress += (startIP + "." + Integer.valueOf(i).toString())
                                    + ",";
                  }
 
                  System.out.println("ipAddress:" + ipAddress);
            }
 
            validate(ipAddress);
      }
 
      private static int tokenize(String startIP) {
 
            StringTokenizer st;
            st = new StringTokenizer(startIP, ".");
            int i, j, k = 0;
            j = st.countTokens();
            String[] ip = new String[j];
 
            while (st.hasMoreTokens()) {
 
                  ip[k] = st.nextToken();
                  k++;
            }
 
            s = ip[0] + "." + ip[1] + "." + ip[2];
 
            return ((Integer.parseInt(ip[k - 1])));
      }
 
      public static void validate(String input) {
 
            String ipAddress = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
            Pattern p = Pattern.compile(ipAddress);
            Matcher m;
 
            StringTokenizer token;
            token = new StringTokenizer(input, ",");
            int j, k = 0;
            j = token.countTokens();
 
            String[] ip = new String[j];
 
            while (token.hasMoreTokens()) {
 
                  ip[k] = token.nextToken();
                  k++;
            }
 
            for (int i = 0; i < k; i++) {
 
                  m = p.matcher(ip[i]);
 
                  if (m.find()) {
 
                        System.out.println(ip[i] + " is valid");
                  } else {
                        System.out.println(ip[i] + " is not valid ");
                  }
            }
      }
}