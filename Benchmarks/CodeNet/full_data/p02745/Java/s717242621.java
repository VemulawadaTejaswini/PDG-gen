package com.sample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			int abLeft = leftMaxEq(a, b);
			int abRight = righttMaxEq(a, b);
			int acLeft = leftMaxEq(a, c);
			int acRight = righttMaxEq(a, c);
			
			int base = a.length();
			base += b.length() - Math.max(abLeft, abRight);
			base += c.length() - Math.max(acLeft, acRight);
			System.out.println(base);
		}
	}

	public static int leftMaxEq(String a, String b) {
		int length = Math.min(a.length(), b.length());
		for (int i = length; i > 1; i--) {
			String suba = a.substring(0, i);
			String subb = b.substring(b.length() - i, b.length());
			StringBuilder newSuba = new StringBuilder(suba.length());
			for (int j = 0; j < suba.length(); j++) {
				if (suba.charAt(j) == '?') {
					newSuba.append(subb.charAt(j));
				} else {
					newSuba.append(suba.charAt(j));
				}
			}
			if (newSuba.toString().matches(subb.replaceAll("\\?", "."))) {
				return newSuba.length();
			}
		}
		return 0;
	}
	
	public static int righttMaxEq(String a, String b) {
		return leftMaxEq(b,  a);
	}

}
