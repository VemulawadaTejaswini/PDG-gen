import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		long[][] as = new long[2][N];
		long[][] dp = new long[2][N];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < N; j++){
				as[i][j] = sc.nextLong();
			}
		}
		
		dp[0][0] = as[0][0];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < N; j++){
				if(i != 0){
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + as[i][j]);
				}
				if(j != 0){
					dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + as[i][j]);
				}
			}
		}
		
		System.out.println(dp[1][N - 1]);
		
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}