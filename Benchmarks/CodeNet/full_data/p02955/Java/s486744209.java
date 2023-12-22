//package abc136;
import java.io.*;
import java.util.*;

public class Main{
	// ------------------------
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		// ------------------------
		int n = sc.nextInt(), k = sc.nextInt();
		long sum = 0;
		long[] a = new long[n];
		for(int i = 0; i < n; i++)
			sum += a[i] = sc.nextInt();
		long ans = 1;
		for(int i = 1; i * i <= sum; i++)
			if(sum % i == 0) {
				if(i > ans && works(a, k, i))
					ans = i;
				if(sum / i > ans && works(a, k, sum / i))
					ans = sum / i;	
			}
		out.println(ans);
		// ------------------------
		out.close();
	}
	//------------------------
	public static boolean works(long[] a, int k, long x) {
		long[] b = new long[a.length];
		for(int i = 0; i < b.length; i++)
			b[i] = a[i] % x;
		Arrays.sort(b);
		int add = b.length - 1, sub = 0;
		for(int i = 0; i < k; i++) {
			while(add >= 0 && b[add] == x)
				add--;
			while(sub < b.length && b[sub] == 0)
				sub++;
			if(add <= sub)
				break;
			b[add]++;
			b[sub]--;
		}
		for(long i : b)
			if(i % x != 0)
				return false;
		return true;
	}
	public static PrintWriter out;
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
