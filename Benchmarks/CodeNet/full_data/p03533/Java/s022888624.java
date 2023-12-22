import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args){
		try(final Scanner sc = new Scanner(System.in)){
			final String s = sc.next();
			
			final String expr = "^A?KIHA?BA?RA?$";
			
			System.out.println(s.matches(expr) ? "Yes" : "No");
		}
	}
	
	public static class Scanner implements AutoCloseable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {tok = new StringTokenizer(br.readLine());}
			} catch(IOException e){ /* ignore */ }
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine(); return tok.nextToken();
		}

		public int nextInt(){
			return Integer.parseInt(next());
		}
		public long nextLong(){
			return Long.parseLong(next());
		}
		public double nextDouble(){
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n){
			int[] ret = new int[n];
			for(int i = 0; i < n; i++){ ret[i] = nextInt(); }
			return ret;
		}
		public long[] nextLongArray(int n){
			long[] ret = new long[n];
			for(int i = 0; i < n; i++){ ret[i] = nextLong(); }
			return ret;
		}
		public double[] nextDoubleArray(int n){
			double[] ret = new double[n];
			for(int i = 0; i < n; i++){ ret[i] = nextDouble(); }
			return ret;
		}

		public void close() {
			try{ br.close(); } catch (IOException e){ /*ignore*/ }
		}
	}
}
