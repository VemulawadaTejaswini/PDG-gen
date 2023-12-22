import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int x=sc.nextInt();
		if(x==1 || x==2*N-1) {
			pl("No");
		}
		else {
			pl("Yes");
			int[] ary=new int[2*N-1];
			if(x>=N) {
				int diff=x-N;
				int counter=0;
				for(int i=1+diff; i<=2*N-1; i++) {
					ary[counter]=i;
					counter++;
				}
				for(int i=1; i<=diff; i++) {
					ary[counter]=i;
					counter++;
				}
			}
			else if(x<N) {
				int first=N+x;
				int counter=0;
				for(int i=first; i<=2*N-1; i++) {
					ary[counter]=i;
					counter++;
				}
				for(int i=1; i<first; i++){
					ary[counter]=i;
					counter++;
				}
			}
			for(int i=0; i<N*2-1; i++) {
				pl(ary[i]);
			}
		}
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
	public static void p(Object o) {
		System.out.print(o);
	}
}
