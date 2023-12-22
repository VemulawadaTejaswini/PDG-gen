import java.io.*;
import java.util.*;
public class Main {
	public static class FS {
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
	}

	public static int abs(int x) { if (x < 0) return -x; return x; }

	public static void main(String[] args) {
		FS in = new FS();
	
		int n = in.nextInt();
		char[] A = in.next().toCharArray();
		char[] B = in.next().toCharArray();
		char[] C = new char[n << 1];
		for (int i = 0; i < n; i++)
			C[2 * i] = A[i];
		for (int i = 0; i < n; i++)
			C[2 * i + 1] = B[i];
		System.out.println((new String(C)));
	}
}
