import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class Main {
	
	static int N , W;
	static int[] v , w;
	
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		N = sc.nextInt();
		W = sc.nextInt();
		w = new int[N];
		v = new int[N];
		for(int i = 0; i < N ;i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long ans = funKnapscack(W, N, w, v);
		System.out.println(ans);
	}
	public static long funKnapscack(int w, int n, int[] weights , int []prices ) {
		long table[][] = new long[n+1][w+1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0 ; j <= w ; j++ ) {
				if(i == 0 || j == 0) {
					table[i][j] = 0;
					continue;
				}
				long inc = 0;
				if((j-weights[i-1] >= 0)) {
				inc = prices[i-1] + table[i-1][j - weights[i-1]];}
				
				long exc = table[i-1][j];
				table[i][j] = Math.max(inc,exc); 
			}
		}
		
		
		return table[n][w];
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
