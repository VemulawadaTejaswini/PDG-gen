import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] masu=new int[M];
		for(int i=0; i<M; i++) {
			masu[i]=sc.nextInt();
		}
		Arrays.sort(masu);
		if(M==1) {
			pl(0);
			System.exit(0);
		}
		if(N==1) {
			pl(masu[M-1]-masu[0]);
			System.exit(0);
		}
		else {
			if(N>=M) {	//コマが過剰のとき
				pl(0);
				System.exit(0);
			}
			else {
				int[] sa=new int[M-1];
				for(int i=0; i<M-1; i++) {
					sa[i]=masu[i+1]-masu[i];
				}
				Arrays.sort(sa);
				int max=masu[M-1]-masu[0];
				for(int i=0; i<N-1; i++) {
					max-=sa[M-2-i];
				}
				pl(max);
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