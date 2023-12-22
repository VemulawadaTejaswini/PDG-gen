
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.StandardSocketOptions;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static int lowerBound(ArrayList<Integer> array, int length, long value) {
		int low = 0;
		int high = length;
		while (low < high) {
			final int mid = (low + high) / 2;
			if (value <= array.get(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

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

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				// if (entry1[col] > entry2[col])
				// return 1;
				// else //(entry1[col] >= entry2[col])
				// return -1;
				return new Integer(entry1[col]).compareTo(entry2[col]);
				// return entry1[col].
			}
		}); // End of function call sort().
	}

	class pair<X, Y> { // utilizing Java "Generics"
		X _first;
		Y _second;

		public pair(X f, Y s) {
			_first = f;
			_second = s;
		}

		X first() {
			return _first;
		}

		Y second() {
			return _second;
		}

		void setFirst(X f) {
			_first = f;
		}

		void setSecond(Y s) {
			_second = s;
		}
	}

	static long nCr(long n, long r) {
		long x = 1;
		long yu = n - r;
		while (n > r) {
			x = x * n;
			n--;
		}

		while (yu > 0) {
			x /= yu;
			yu--;
		}
		return x;
	}

	/*
	 * static boolean prime[] = new boolean[1000007];
	 * 
	 * public static void sieveOfEratosthenes(int n) {
	 * 
	 * for (int i = 0; i < n; i++) prime[i] = true;
	 * 
	 * for (int p = 2; p * p <= n; p++) { // If prime[p] is not changed, then it
	 * is a prime if (prime[p] == true) { // Update all multiples of p for (int
	 * i = p * p; i <= n; i += p) prime[i] = false; } }
	 * 
	 * // Print all prime numbers // for(int i = 2; i <= n; i++) // { //
	 * if(prime[i] == true) // System.out.print(i + " "); // } }
	 */
	public static void main(String[] args) throws NumberFormatException, IOException, ScriptException {
		FastReader sc = new FastReader();
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// Scanner scn = new Scanner(System.in);
		//
		int n = sc.nextInt();
	String s=sc.next();
	if(n%2==0 && (s.substring(0,n/2).equals(s.substring((n/2)))))
	{
		
		System.out.println("Yes");
	}
	else
		System.out.println("No");
	//System.out.println(s.substring(0,n/2)+" "+s.substring((n/2)+1));
		//
		// coded to perfection by Rohan Mukhija
		// pr.flush();
		// pr.close();
	}

	private static boolean possible(long[] arr, int[] f, long mid, long k) {
		long c = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] * f[f.length - i - 1]) > mid) {
				c += (arr[i] - (mid / f[f.length - i - 1]));
			}
		}
		// System.out.println(mid+" "+c);
		if (c <= k)
			return true;
		return false;
	}

}
