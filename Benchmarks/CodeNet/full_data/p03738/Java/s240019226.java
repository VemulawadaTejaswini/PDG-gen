/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		String result = "";
		
		System.out.println(compareson(first, second));
	}
	public static String compareson(String a, String b) {
		if(a.length() > b.length()) {
			return "GREATER";
		} else if(a.length() < b.length()) {
			return "LESS";
		} else {
			return value(a, b);
		}
	}
	public static String value(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			int val1 = Character.getNumericValue(a.charAt(i));
			int val2 = Character.getNumericValue(b.charAt(i));
			if(val1 > val2) {
				return "GREATER";
			} else if(val1 < val2) {
				return "LESS";
			}
		}
		return "EQUAL";
	}
}