import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		int N = input.nextInt();
		int K = input.nextInt();
		long S = input.nextLong();
		int L = 1;
		long inf = (long)(1e9);
		if (S==inf) inf=1;
		for (int i = 1; i <= K; i++) {
			w.print(S+" ");
			w.flush();
			L=i+1;
		}
		for (int i = L; i <= N; i++) {
			w.print(inf+" ");
			w.flush();
		}
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
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