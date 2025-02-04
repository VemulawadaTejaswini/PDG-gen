import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class AtCoderDp_A_Frog1 {
	
	static int N = (int)1e9 + 7;
	static int dp[];
 
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();

		int n = sc.nextInt();
		int a[] = sc.readArray(n);
		dp = new int[n+1];
		Arrays.fill(dp, N);
		dp[0] = 0;
		for(int i = 0 ; i < n ; ++i ) {
			for(int j : new int[]{i+1  , i+2}) {
				if(j < n) {
					dp[j] = Math.min(dp[j], dp[i] + Math.abs(a[j] - a[i]));
				}
			}
		}
		System.out.println(dp[n-1]);
		
	}
	
	public void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
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
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
 
}
