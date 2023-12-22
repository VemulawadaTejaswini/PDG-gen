import java.util.*;
import java.io.*;

public class Main 
{
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);
	
	int n, min, arr[];
	
	Main() {
		arr = new int[n = in.nextInt()];
		for (int i = 0; i < n; arr[i++] = in.nextInt());

		min = 400_000*n;
		for (int j = -100; j <= 100; j++) {
			int cost = 0;
			for (int i = 0; i < n; i++)
				cost += (arr[i] - j)*(arr[i] - j);
			min = min(min, cost);
		}
		out.println(min);
		out.close();
	}
	
	int min(int a, int b) {
		if (a < b)
			return a;
		return b;
	}
	
	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenier("");
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
