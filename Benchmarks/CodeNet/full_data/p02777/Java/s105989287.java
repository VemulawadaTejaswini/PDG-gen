import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String u = sc.next();
		if(s.equals(u))
			a--;
		if(t.equals(u))
			b--;
		pw.println(a+" "+b);
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
