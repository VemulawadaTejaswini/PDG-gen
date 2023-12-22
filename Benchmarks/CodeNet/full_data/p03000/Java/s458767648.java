import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		Long K=sc.nextLong();
		long[] array=new long[N];
		for(int i=0; i<N; i++) {
			array[i]=sc.nextLong();
		}
		long sum=0;
		long ans=0;
		int l=0;
		int right=0;
		long[] tohri=new long[N+1];
		Arrays.fill(tohri,0);
		for(int left=0; left<N; left++) {
			while(right<N && sum<K) {
				sum+=array[right];
				right++;
			}
			if(sum>=K) {
				tohri[left]+=((long)N-right+1);
			}
			if(right==left) {
				right++;
			}else {
				sum-=array[left];
			}
		}
		for(int i=0; i<=N; i++) {
			ans+=tohri[i];
		}
		pl(Math.min(ans,N+1));
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