

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
import java.util.LinkedHashMap;
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

	// public static void sortbyColumn(int arr[][], int col) {
	// // Using built-in sort function Arrays.sort
	// Arrays.sort(arr, new Comparator<int[]>() {
	//
	// @Override
	// // Compare values according to columns
	// public int compare(final int[] entry1, final int[] entry2) {
	//
	// // To sort in descending order revert
	// // the '>' Operator
	// // if (entry1[col] > entry2[col])
	// // return 1;
	// // else //(entry1[col] >= entry2[col])
	// // return -1;
	// return new Integer(entry1[col]).compareTo(entry2[col]);
	// // return entry1[col].
	// }
	// }); // End of function call sort().
	// }

	static class pair {
		int V, I;

		pair(int v, int i) {
			V = v;
			I = i;
		}
	}

	public static int[] swap(int data[], int left, int right) {
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
		return data;
	}

	public static int[] reverse(int data[], int left, int right) {
		while (left < right) {
			int temp = data[left];
			data[left++] = data[right];
			data[right--] = temp;
		}
		return data;
	}

	public static boolean findNextPermutation(int data[]) {
		if (data.length <= 1)
			return false;

		int last = data.length - 2;
		while (last >= 0) {
			if (data[last] < data[last + 1]) {
				break;
			}
			last--;
		}
		if (last < 0)
			return false;

		int nextGreater = data.length - 1;
		for (int i = data.length - 1; i > last; i--) {
			if (data[i] > data[last]) {
				nextGreater = i;
				break;
			}
		}
		data = swap(data, nextGreater, last);
		data = reverse(data, last + 1, data.length - 1);
		return true;
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
	 * for (int i = 0; i < n; i++) prime[i] = true; * for (int p = 2; p * p <=
	 * n; p++) { // If prime[p] is not changed, then it is a prime if (prime[p]
	 * == true) { // Update all multiples of p for (int i = p * p; i <= n; i +=
	 * p) prime[i] = false; } }
	 * 
	 * // Print all prime numbers // for(int i = 2; i <= n; i++) // { //
	 * if(prime[i] == true) // System.out.print(i + " "); // } }
	 */

	static long power(long fac2, int y, int p) {
		long res = 1;
		fac2 = fac2 % p;
		while (y > 0) {
			if (y % 2 == 1)
				res = (res * fac2) % p;
			fac2 = (fac2 * fac2) % p;
		}
		return res;
	}

	static long modInverse(long fac2, int p) {
		return power(fac2, p - 2, p);
	}

	static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		// This is checked so that we can skip
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	public static BigInteger lcmm(String a, String b) {
		BigInteger s = new BigInteger(a);
		BigInteger s1 = new BigInteger(b);
		BigInteger mul = s.multiply(s1);
		BigInteger gcd = s.gcd(s1);
		BigInteger lcm = mul.divide(gcd);
		return lcm;
	}
	static long setBitNumber(long n) 
	{ 
	    if (n == 0) 
	        return 0; 
	  
	    long msb = 0; 
	    while (n != 0) 
	    { 
	        n = n / 2; 
	        msb++; 
	    } 
	  
	    return msb; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException, ScriptException {
		FastReader sc = new FastReader();
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scn = new Scanner(System.in);
		//
		HashMap<Long,Long>h=new HashMap<>();
		long y=(long)Math.pow(10, 12);
		for(long i=1;i<=y;i*=2)
		{
			h.put(i, ((2*i)-1));
		}
		long a=sc.nextLong();
		a=setBitNumber(a);
	//	System.out.println(a);
		System.out.println(h.get((long)Math.pow(2, a-1)));
		//
		// coded to perfection by Rohan Mukhija
		pr.flush();
		pr.close();
	}

	static HashMap<Integer, Integer> h = new HashMap<>();

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
