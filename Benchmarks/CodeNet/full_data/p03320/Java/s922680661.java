import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int K = sc.nextInt();
			
			/*
			final int CHECK = 10000000;
			double[] value = new double[CHECK];
			for(int i = 1; i < CHECK; i++) {
				value[i] = i;
				
				int lower = 0;
				for(int k = i; k > 0; k /= 10) {
					lower += (k % 10);
				}
				value[i] /= lower;
			}
			for(int i = 1; i < CHECK; i++) {
				boolean ok = true;
				
				for(int j = i + 1; j < CHECK; j++) {
					if(value[i] > value[j]) { ok = false; break; }
				}
				
				if(ok) {
					System.out.println(i + " " + value[i]);
				}
			}
			*/
			
			for(int i = 1; i <= 9 + 9 + 9; i++) {
				System.out.print(((i - 1) % 9) + 1);
				
				for(int j = i - 9; j > 0; j -= 9) {
					System.out.print(9);
				}
				System.out.println();
			}
			
			int higher_number = 10;
			int higher_base = 10;
			int higher_keta = 2;
			
			int higher_limit = 20;
			int higher_limit_digit = 2;
			int keta = 4;
			
			for(int i = 9 + 9 + 9 + 1; i <= K; i++) {
				System.out.print(higher_number);
				for(int j = 0; j < (keta - higher_keta); j++) {
					System.out.print(9);
				}
				System.out.println();
				
				if(higher_number + 1 >= higher_limit) {
					higher_number += higher_base;
				}else {
					higher_number += 1;
				}
				
				if(higher_number >= higher_base * 10) {
					higher_limit += 10;
					higher_limit_digit += 1;
					higher_number = 10;
					keta++;
				}
				
				if(higher_limit_digit >= 10) {
					higher_keta += 1;
					higher_limit_digit = 1;
					higher_base *= 10;
				}
				
			}
			
			
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}