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
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final char[] s = sc.next().toCharArray();
			final char[] t = sc.next().toCharArray();
			
			final int SIZE = 26;
			ArrayList<TreeSet<Integer>> patterns = new ArrayList<TreeSet<Integer>>();
			for(int i = 0; i < SIZE; i++) { patterns.add(new TreeSet<Integer>()); }
			
			for(int index = 0; index < s.length; index++) {
				final int alpha = s[index] - 'a';
				patterns.get(alpha).add(index);
			}
			
			/*
			for(int i = 0; i < SIZE; i++) {
				final char alpha = (char)('a' + i);
				System.out.println(alpha + " : " + patterns.get(i));
			}
			*/
			
			int current_index = 0;
			long answer = 0;
			
			for(int index = 0; index < t.length; index++) {
				final int alpha = t[index] - 'a';
				final TreeSet<Integer> current = patterns.get(alpha);
				
				//System.out.println(index + " : " + current + " " + current_index + " " + answer);
				
				final Integer ceiling_index = current.ceiling(current_index);
				//System.out.println(ceiling_index);
				if(ceiling_index != null) {
					answer += ((ceiling_index + 1) - current_index);
					current_index = ceiling_index + 1;
				}else {
					final Integer first_index = current.first();
					if(first_index != null) {
						answer += ((first_index + 1) + (s.length - current_index));
						current_index = (first_index + 1);
					}else {
						System.out.println("-1");
						return;
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