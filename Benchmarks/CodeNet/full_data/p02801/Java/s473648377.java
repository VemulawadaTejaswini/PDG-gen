package test;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] b = a.toCharArray();
		int c = b[0] + 1;
		char d = (char)c;
		System.out.println(d);
	}
	
}
