import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] counts = new int[N + 1];
		
		boolean[] is_prime = new boolean[N + 1];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		//System.out.println(Arrays.toString(is_prime));
		
		for(int i = 2; i <= N; i++){
			if(!is_prime[i]){ continue; }
			
			is_prime[i] = true;
			counts[i]++;
			//System.out.println(i);
			
			for(int j = i * 2; j <= N; j += i){
				is_prime[j] = false;
				
				//System.out.println(i + " " + j);
				for(int k = j; k > 1; k /= i){ 
					if(k % i != 0){ break; }
					counts[i]++;
				}
				//System.out.println(counts[i]);
			}
		}
		
		//System.out.println(Arrays.toString(is_prime));
		//System.out.println(Arrays.toString(counts));
		
		long answer = 1;
		for(int i = 0; i <= N; i++){
			if(counts[i] <= 0){ continue; }
			
			answer *= (counts[i] + 1);
			answer %= 1000000007;
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
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}