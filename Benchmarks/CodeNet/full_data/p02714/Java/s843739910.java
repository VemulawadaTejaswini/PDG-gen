import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	/*
	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	*/
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			final char[] chs = sc.next().toCharArray();
			int R = 0, G = 0, B = 0;
			for(final char ch : chs) {
				switch(ch){
				case 'R': R++; break;
				case 'G': G++; break;
				case 'B': B++; break;
				}
			}
			
			int[] rs = new int[R];
			int[] gs = new int[G];
			int[] bs = new int[B];
			{
				int r = 0, b = 0, g = 0;
				
				for(int i = 0; i < N; i++) {
					final char ch = chs[i];
					switch(ch){
					case 'R': rs[r++] = i; break;
					case 'G': gs[g++] = i; break;
					case 'B': bs[b++] = i; break;
					}
				}
			}
			
			long answer = 0;
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					if(chs[i] == chs[j]) { continue; }
					
					if(chs[i] == 'R') {
						if(chs[j] == 'G') {
							// B
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(bs, j) >= 0;
							final int size = B - (hasJ ? Arrays.binarySearch(bs, j) : - (1 + Arrays.binarySearch(bs, j)));
							final boolean hasK = Arrays.binarySearch(bs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}else {
							// G
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(gs, j) >= 0;
							final int size = G - (hasJ ? Arrays.binarySearch(gs, j) : - (1 + Arrays.binarySearch(gs, j)));
							final boolean hasK = Arrays.binarySearch(gs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}
					}else if(chs[i] == 'G') {
						if(chs[j] == 'R') {
							//B
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(bs, j) >= 0;
							final int size = B - (hasJ ? Arrays.binarySearch(bs, j) : - (1 + Arrays.binarySearch(bs, j)));
							final boolean hasK = Arrays.binarySearch(bs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}else {
							// R
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(rs, j) >= 0;
							final int size = R - (hasJ ? Arrays.binarySearch(rs, j) : - (1 + Arrays.binarySearch(rs, j)));
							final boolean hasK = Arrays.binarySearch(rs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}
					}else {
						if(chs[j] == 'R') {
							// G
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(gs, j) >= 0;
							final int size = G - (hasJ ? Arrays.binarySearch(gs, j) : - (1 + Arrays.binarySearch(gs, j)));
							final boolean hasK = Arrays.binarySearch(gs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}else {
							// R
							final int k = (j - i) + j;
							final boolean hasJ = Arrays.binarySearch(rs, j) >= 0;
							final int size = R - (hasJ ? Arrays.binarySearch(rs, j) : - (1 + Arrays.binarySearch(rs, j)));
							final boolean hasK = Arrays.binarySearch(rs, k) >= 0;
							
							answer += size - (hasK ? 1 : 0);
						}
					}
				}
			}
			
			System.out.println(answer);
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
