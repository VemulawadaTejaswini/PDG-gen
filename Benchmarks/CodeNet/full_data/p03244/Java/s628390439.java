
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();

		Integer[] kisu = new Integer[100000];
		Integer[] gusu = new Integer[100000];

		Arrays.fill(kisu,0);
		Arrays.fill(gusu,0);

		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			if ((i+1) %2==0) {
				gusu[v]++;
			} else {
				kisu[v]++;
			}
		}

		Arrays.sort(kisu, (e1, e2)-> e2-e1);
		Arrays.sort(gusu, (e1, e2)-> e2-e1);

		if (kisu[0] + gusu[0] == n) {
			out.println(n/2);
		} else {
			out.println((n/2-kisu[0])+(n/2-gusu[0]));
		}

		out.flush();

	}

	static class Toi {
		public int x;
		public int y;
		public long h;

		public Toi(int x, int y, long h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}

		@Override public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}

			if (this == obj) {
				return true;
			}

			if (this.getClass() != obj.getClass()) {
				return false;
			}

			Toi toi = (Toi) obj;
			return x == toi.x && y == toi.y && h == toi.h;
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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
