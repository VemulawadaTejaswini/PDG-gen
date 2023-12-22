import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			final String[] S = new String[N];
			for(int i = 0; i < N; i++){
				S[i] = sc.next();
			}
			final String T = sc.next();
			
			TreeMap<String, Integer> count = new TreeMap<String, Integer>();
			for(int i = 0; i < N; i++){
				if(!count.containsKey(S[i])){
					count.put(S[i], 0);
				}
				
				count.put(S[i], count.get(S[i]) + 1);
			}
			
			ArrayList<String> distinct = new ArrayList<String>(count.keySet());
			int pos = Collections.binarySearch(distinct, T);
			if(pos < 0){
				int prev = 0;
				for(int i = 0; i < (-pos); i++){
					prev += count.get(distinct.get(i));
				}
				
				System.out.println(prev);
			}else{
				int prev = 0;
				for(int i = 0; i < pos; i++){
					prev += count.get(distinct.get(i));
				}
				
				for(int i = 0; i <= count.get(distinct.get(pos)); i++){
					System.out.print((i == 0 ? "" : " ") + (prev + i + 1));
				}
				System.out.println();
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