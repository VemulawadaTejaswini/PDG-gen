import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		String S = input.next();
		int N = S.length();
		long ans = 0;
		long B = 0;
		for (int L = 0; L<N; L++) {
			if (S.charAt(L)=='B') {
				long W = 0;
				B++;
				L++;
				for (int next = L; next < N; next++) {
					if (S.charAt(next)=='W') break;
					L++;
					B++;
				}
				for (int next = L; next < N; next++) {
					if (S.charAt(next)=='B') break;
					L++;
					W++;
				}
				ans+=B*W;
				L--;
			}
		}
		w.println(ans);
		w.flush();
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
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
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
