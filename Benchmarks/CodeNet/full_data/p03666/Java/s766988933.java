import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N;
		long A,B,C,D;
		N=sc.nextInt();
		A=sc.nextLong();
		B=sc.nextLong();
		C=sc.nextLong();
		D=sc.nextLong();
		for (int i=0; i<N; i++) {
			if((C*((long)(N-1-i))-D*((long)i))<=(B-A) && (B-A)<=-C*((long)i)+((long)(N-1-i))*D) {
				pl("YES");
				System.exit(0);
			}
		}
		pl("NO");
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
