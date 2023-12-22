// javac Main.java && java _

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);

	int n;
	char[] S;
	
	Main() {
		n = in.nextInt();
		S = in.next().toCharArray();
		int len = S.length;
		for (int i = 0; i < len; i++) {
			int nu = (S[i] - 'A' + n) % 26;
			S[i] = (char) (nu + 'A');
		}
		out.println((new String(S)));
		out.close();
	}
	
	

	int min(int a, int b) { if (a < b) return a; return b; }	
	int max(int a, int b) { if (a > b) return a; return b; }	
	long min(long a, long b) { if (a < b) return a; return b; }	
	long max(long a, long b) { if (a > b) return a; return b; }	

	boolean z(int x) { if (x == 0) return true; return false; }
	boolean z(long x) { if (x == 0) return true; return false; }
	
	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}

