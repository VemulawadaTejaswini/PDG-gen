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
		int[] mizu=new int[N];
		int min=888;
		for(int i=0; i<N; i++) {
			mizu[i]=sc.nextInt();
			min=Math.min(mizu[i], min);
		}
		int ans=min;
		for(int i=0; i<N; i++) {
			mizu[i]-=min;
		}

		while(ok(mizu)) {
			int kaisi=0;
			int owari=0;
			boolean mi=false;
			for(int i=0; i<N; i++) {
				if(!mi) {		//まだ水やりの場所を確定させていない
					if(mizu[i]>0) {
						kaisi=i;
						owari=i;
						mi=true;
					}
				}
				else {
					if(mizu[i]>0) {
						owari=i;
					}
					else if(mizu[i]==0) {
						break;
					}
				}
			}
			min=888;
			for(int unko=kaisi; unko<=owari; unko++) {
				min=Math.min(min, mizu[unko]);
			}
			for(int unko=kaisi; unko<=owari; unko++) {
				mizu[unko]-=min;
			}
			ans+=min;
		}
		pl(ans);
	}

 	public static boolean ok(int[] a) {
 		for(int i=0; i<a.length; i++) {
 			if(a[i]!=0) {
 				return true;
 			}
 		}
 		return false;
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