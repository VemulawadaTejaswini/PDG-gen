import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		/* 方針
		 * 全色揃えるには必ず足りない色のスライムの色の数だけ捕まえないといけない
		 * （呪文では種類は増えないので）
		 * Nが2000なので、O(N^2)でも間に合う。
		 * 全色捕まえまくるのと捕まえて呪文を繰り返すか
		 * 捕まえるスライムは最もコストの少ない個体でよい
		 */
		int N=sc.nextInt();
		long x=sc.nextInt();
		long min_tuka=1_000_000_000_000_000_000L;
		int soeji=0;
		long[] a=new long[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextLong();
			min_tuka=Math.min(min_tuka, a[i]);
			if(min_tuka==a[i]) {
				soeji=i;
			}
		}
		long ans=0;
		for(int i=0; i<N; i++) {
			ans+=Math.min(a[(i+soeji)%N], min_tuka+x);
		}
		pl(ans);
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