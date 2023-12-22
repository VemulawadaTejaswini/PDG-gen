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
			
			final char[] S = sc.next().toCharArray();
			final char[] T = sc.next().toCharArray();
			
			long[] S_A = new long[S.length + 1];
			long[] S_B = new long[S.length + 1];
			for(int i = 0; i < S.length; i++){
				if(S[i] == 'A'){
					S_A[i + 1]++;
				}else{
					S_B[i + 1]++;
				}
				
				S_A[i + 1] += S_A[i];
				S_B[i + 1] += S_B[i];
			}
				
			int[] T_A = new int[T.length + 1];
			int[] T_B = new int[T.length + 1];
			for(int i = 0; i < T.length; i++){
				if(T[i] == 'A'){
					T_A[i + 1]++;
				}else{
					T_B[i + 1]++;
				}
				
				T_A[i + 1] += T_A[i];
				T_B[i + 1] += T_B[i];
			}
			
			final int Q = sc.nextInt();
			for(int q = 0; q < Q; q++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final int c = sc.nextInt() - 1;
				final int d = sc.nextInt() - 1;
				
				final long S_num = ((S_A[b + 1] - S_A[a]) * 2 + (S_B[b + 1] - S_B[a])) % 3;
				final long T_num = ((T_A[d + 1] - T_A[c]) * 2 + (T_B[d + 1] - T_B[c])) % 3;
				
				//System.out.println(S_num + " " + T_num);
				System.out.println(S_num == T_num ? "YES" : "NO");
				
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