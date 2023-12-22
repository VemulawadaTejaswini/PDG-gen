import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long A = sc.nextLong();
			final long B = sc.nextLong();
			
			final int SIZE = 1000000;
			boolean[] isPrime = new boolean[SIZE + 1];
			Arrays.fill(isPrime, true);
			isPrime[0] = isPrime[1] = false;
			
			for(int i = 2; i <= SIZE; i++) {
				if(!isPrime[i]) { continue; }
				
				for(int j = 2 * i; j <= SIZE; j += i) {
					isPrime[j] = false;
				}
			}
			
			long A_rest_prime = A, B_rest_prime = B;
			long A_B_common_primes = 0;
			for(int i = 2; i <= SIZE; i++) {
				if(!isPrime[i]) { continue; }
				
				final boolean isA = A_rest_prime % i == 0;
				final boolean isB = B_rest_prime % i == 0;
				
				while(A_rest_prime > 0 && A_rest_prime % i == 0) { A_rest_prime /= i; }
				while(B_rest_prime > 0 && B_rest_prime % i == 0) { B_rest_prime /= i; }
				
				if(isA && isB) {
					//System.out.println(i + " " + A_rest_prime + " " + B_rest_prime);
					A_B_common_primes += 1;
				}
			}
			
			System.out.println(A_B_common_primes + ((A_rest_prime != 0 && B_rest_prime != 0 && A_rest_prime == B_rest_prime) ? 1 : 0));
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