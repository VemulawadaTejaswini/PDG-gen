import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		final String fst = sc.next();
		final String lst = sc.next();
		
		int answer = Math.max(N, fst.length() + lst.length());
		
		final int min_len = Math.min(fst.length(), lst.length());
		for(int common_len = 1; common_len <= min_len; common_len++){
			boolean flg = true;
			
			for(int i = 0; i < common_len; i++){
				final int fst_point = (fst.length() - common_len) + i;
				final int lst_point = i;
				
				if(fst.charAt(fst_point) != lst.charAt(lst_point)){
					flg = false;
					break;
				}
			}
			
			if(flg){
				final int next_length = fst.length() + lst.length() - common_len;
				//System.out.println(fst.substring(0, fst.length() - common_len) + lst);
				
				if(next_length >= N){
					answer = Math.min(answer, next_length);
				}
			}
		}
		
		System.out.println(answer);
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