

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static int lowerBound(long[] array, int length, long value) {
		int low = 0;
		int high = length;
		while (low < high) {
			final int mid = (low + high) / 2;
			if (value <= array[mid]) {
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


	public static void main(String[] args) throws NumberFormatException, IOException {
		FastReader sc = new FastReader();
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// Scanner scn = new Scanner(System.in);
		// PrintWriter pr = new PrintWriter(new BufferedWriter(new
		// OutputStreamWriter(System.out)));
		 String s=sc.next();
		ArrayList<String>arr=new ArrayList<>();  
		arr.add(""+s.charAt(0));
		int l=0;
		 for(int i=1;i<s.length();i++)
		   {
			 String m=""+s.charAt(i);
			   if(arr.get(l).equals((m)))
			   {
				   l++;
				   if(i==s.length()-1)
				   {
					   
				   }
				   else{
				   m+=s.charAt(i+1);
				   i++;
				   
				   }
				   arr.add(m);
			   }
			   else
			   {l++;
				   arr.add(m);
			   }
			   
		   }
		 for(int i=0;i<arr.size()-2;i++)
		 {
			 if(arr.get(i).length()>1 && 1<arr.get(i+2).length() && arr.get(i)!=arr.get(i+2))
			 
			 {
				 l++;
			 }
		 }
		// System.out.println(arr); 
		 
		 System.out.println(l);
	}

}