// javac Main.java && java _

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);
	
	HashMap<String, Integer> ans;	
	
	Main() {
		ans = new HashMap<>();
		ans.put("SUN", 7);
		ans.put("SAT", 1);
		ans.put("FRI", 2);
		ans.put("THU", 3);
		ans.put("WED", 4);
		ans.put("TUE", 5);
		ans.put("MON", 6);

		out.println(ans.get(in.next()));
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

