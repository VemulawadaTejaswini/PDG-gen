import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	static long[] ary;
	static int N;
	static int min,max;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		/*二分探索でいけそう
		 * でかいやつが小さいものから食っていく。
		 *
		 *そのでかいやつが何番目までならOKか？
		 *
		 */
		N=sc.nextInt();
		ary=new long[N];
		for(int i=0; i<N; i++) {
			ary[i]=sc.nextLong();
		}
		Arrays.sort(ary);
		min=0;
		max=N-1;
		while(max-min>1) {
			int mid=(max+min)/2;
			if(bs(mid)) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		boolean mmn=bs(min);
		boolean mmx=bs(max);

		if(mmn && mmx) {
			pl(Math.max(N-min,0));
		}
		else if(!mmn && mmx) {
			pl(Math.max(N-max,0));
		}
		else if(!mmn && !mmx) {
			pl(Math.max(N-1-max,0));
		}
	}
	public static boolean bs(int index) {
		long tmp=ary[index];
		for(int i=0; i<index; i++) {
			if(ary[i]<=tmp*2) {
				tmp+=ary[i];
			}
			else {
				return false;
			}
		}
		for(int i=Math.min(index+1,N-1); i<N; i++) {
			if(ary[i]<=tmp*2) {
				tmp+=ary[i];
			}
			else {
				return false;
			}
		}
		return true;
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
