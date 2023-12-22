//package codeforces;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Set;

public class Main {
	// Integer.bitCount(i); count no of 1 bit in a given number
	static Scanner scn = new Scanner(System.in);
	// static int min=Integer.MAX_VALUE;

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static FastReader s = new FastReader();

	static int mod = 1000000007;

	public static void main(String[] args) {
		// System.out.format("%.10f", ans);char c = sc.next().charAt(0);
		// code
		
		int n=scn.nextInt();
		int arr[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		long memo[]=new long[n];
		
		System.out.println(happy(arr, -1, 0,memo));
		
	}
	public static long happy(int arr[][],int k,int i,long memo[])
	{	
		int n=arr.length;
		if(i>=n)
			return 0;
//		if(memo[i]!=0)
//			return memo[i];
		long a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
		for(int j=0;j<3;j++)
		{
			if(j!=k)
			{
				b=happy(arr, j, i+1,memo)+arr[i][j];
			}
				a=Math.max(a, b);
				memo[i]=a;
		}
		
		return a;
	}
	

	public static boolean[] sieveOfEratosthenes(int n) {

		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				// list.add(i);
			}

		}
		return prime;
	}

	public static class Pair implements Comparable {
		int x;
		int y;
		int z;

		Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public int compareTo(Object o) {
			Pair pp = (Pair) o;
			if (pp.x == x)
				return 0;
			else if (x > pp.x)
				return 1;
			else
				return -1;
		}

	}

}
