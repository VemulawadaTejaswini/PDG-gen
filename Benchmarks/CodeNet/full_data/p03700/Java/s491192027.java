import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	static long A,B;
	static int N;
	static long[] h;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		N=sc.nextInt();
		A=sc.nextLong();
		B=sc.nextLong();
		long min=1;
		long max=2_000_000_000_000_000_000L;
		h=new long[N];
		for(int i=0; i<N; i++) {
			h[i]=sc.nextLong();
		}
		while(Math.abs(max-min)>1) {
			long mid=(min+max)/2;
			if(bi(mid)) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		if(bi(min)) {
			pl(min);
		}
		else {
			pl(max);
		}
	}
	static boolean bi(long mid) {
		long kill=0;
		for(int i=0; i<N; i++) {
			long tmp=h[i]-mid*B;
			if(tmp>0) {
				kill+=(tmp+(A-B-1))/(A-B);
			}
		}
		if(mid>=kill) {
			return true;
		}
		else {
			return false;
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