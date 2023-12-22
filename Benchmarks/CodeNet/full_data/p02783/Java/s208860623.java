//package codeforces;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Set;

public class main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;
	//static int count = 0;

	public static void main(String[] args) {
		int h=scn.nextInt();
		int a=scn.nextInt();
		int count=1;
		while(h>a)
		{
			h=h-a;
			count++;
		}
		System.out.println(count);
	}
	

	public static long gcd(long a, long b) {
		if (a == 0)
			return b;
		long l = gcd(b % a, a);
		return l;
	}

	public static void permu(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String res = str.substring(0, i) + str.substring(i + 1);
			permu(res, ans + ch);

		}
	}

	

}
