import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static boolean[][] mati=new boolean[4][4];
	static int[] ns = {0,1,2,3};
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		for(int i=0; i<3; i++) {
			int f=sc.nextInt()-1;
			int t=sc.nextInt()-1;
			mati[f][t]=true;
			mati[t][f]=true;
		}
		permute(ns, ns.length);
		pl("NO");
	}
	private static void swap(int[] v, int i, int j) {
		int t = v[i]; v[i] = v[j]; v[j] = t;
	}

	public static void permute(int[] v, int n) {
		if (n == 1) {
			if(mati[ns[0]][ns[1]] && mati[ns[1]][ns[2]] && mati[ns[2]][ns[3]]) {
				pl("YES");
				System.exit(0);
			}
			else {
				//
			}
		}
		else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				if (n % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}