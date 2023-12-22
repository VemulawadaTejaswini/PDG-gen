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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.Segment;

public class Main {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final char[] ins = sc.next().toCharArray();
			
			final int fst = Character.getNumericValue(ins[0]);
			final int snd = Character.getNumericValue(ins[1]);
			final int thd = Character.getNumericValue(ins[2]);
			final int fur = Character.getNumericValue(ins[3]);
			
			
			for(int i = 0; i <= 1; i++){
				final int snd_value = (i == 0) ? snd : -snd;
				final String snd_str = (i == 0 ? "+" : "-") + snd;
				
				for(int j = 0; j <= 1; j++){
					final int thd_value = (j == 0) ? thd : -thd;
					final String thd_str = (j == 0 ? "+" : "-") + thd;
					
					for(int k = 0; k <= 1; k++){
						final int fur_value = (k == 0) ? fur : -fur;
						final String fur_str = (k == 0 ? "+" : "-") + fur;
						
						final int value = fst + snd_value + thd_value + fur_value;
						if(value != 7){ continue; }
						
						System.out.println(fst + snd_str + thd_str + fur_str+"="+7);
						return;
					}
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
			while (!hasNext()) {
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}