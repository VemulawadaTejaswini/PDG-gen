import java.util.*;
import java.io.*;
import java.math.BigDecimal;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int N = fs.nextInt();
		String A[] = new String[N];
		String B[] = new String[N];
		int K[] = new int[N];
		for(int i=0; i<N; i++){
			A[i] = fs.next();
			B[i] = A[i];
		}

		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				if(k!=i&&B.equals(A[i])
			     K[k] +=1;
			}
		}

		for(int i=0; i<N; i++){
			System.out.println(K[i]);
		}
 
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}
