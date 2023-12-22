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
	
	public static int dfs(int deep, int limit, String[] s, boolean[] used, String answer) {
		if(deep >= limit) {
			//System.out.println(answer);
			return answer.length();
		}
		
		int ret = Integer.MAX_VALUE;
		for(int i = 0; i < s.length; i++) {
			if(used[i]) { continue; }
			
			used[i] = true;
			{
				int maximum = 0;
				String maximum_answer = answer;
				
				LOOP:
				for(int common = 1; ; common++) {
					if(answer.length() < common) { break; }
					if(s[i].length() < common) { break; }
					
					for(int j = 0; j < common; j++) {
						//System.out.println(deep + " : " + common + " : " + j + " " + ((answer.length() - 1) - ((common - 1) - j)));

						final char a_ch = answer.charAt((answer.length() - 1) - ((common - 1) - j));
						final char s_ch = s[i].charAt(j);

						if(a_ch != '?' && s_ch != '?' && s_ch != a_ch) {
							continue LOOP;
						}
					}
					
					{
						StringBuilder sb = new StringBuilder();
						for(int j = 0; j < answer.length() - common; j++) { sb.append(answer.charAt(j)); }
						for(int j = 0; j < common; j++) {
							final char a_ch = answer.charAt((answer.length() - 1) - ((common - 1) - j));
							final char s_ch = s[i].charAt(j);
							
							sb.append(a_ch == '?' ? s_ch : a_ch);
						}
						maximum_answer = sb.toString();
					}
					
					maximum = common;
				}
				
				ret = Math.min(ret, dfs(deep + 1, limit, s, used, maximum_answer + s[i].substring(maximum)));
			}
			used[i] = false;
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final String s1 = sc.next();
			final String s2 = sc.next();
			final String s3 = sc.next();
			
			System.out.println(dfs(0, 3, new String[]{s1, s2, s3}, new boolean[3], ""));
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
