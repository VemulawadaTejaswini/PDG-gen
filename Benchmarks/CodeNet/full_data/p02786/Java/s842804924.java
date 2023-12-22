import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class FastReader{
		BufferedReader br ;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static long log(long x, long b)
	{
	    return (long) (Math.log(x) / Math.log(b));
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		long h =ob.nextLong();
		int k=0;
		long count=0;
		while(h>0) {
			count+=(long)Math.pow(2, k);
			h=h/2;
			k++;
			
		}
		System.out.println(count);
	}
	

}
