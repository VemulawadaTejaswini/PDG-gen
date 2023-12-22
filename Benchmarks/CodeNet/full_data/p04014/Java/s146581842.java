import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long n=sc.nextLong();
		long s=sc.nextLong();
		if(n==s) {
			pl(s+1);
			exit();
		}
		long sq=root(n);
		long sum=0;
		for(long i=2; i<=sq; i++) {	//k　進数で表す　2 < n < sqrt(n)　までを調べると桁数が3いじょうになる
			sum=ketawa(n,i);
			if(sum==s) {
				pl(i);
				exit();
			}
		}
		long nimoji=sq+1;
		for(long i=nimoji; i>=1; i--) {
			long sns=n/i;
			if(i+n%sns==s) {
				pl(sns);
				exit();
			}
		}
		pl(-1);
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
		public double nextFloat() {
			return Float.parseFloat(next());
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
	public static void exit() {
		System.exit(0);
	}
	static long root(long a) {

		int ketasu=0;
		long tmp=a;
		while(tmp>0) {
			ketasu++;
			tmp/=10;
		}
		int constant=(ketasu+1)/2;	//よく使うので定数化
		if(ketasu>=1) {
			long[] suuji=new long[constant];
			tmp=a;
			for(int i=0; i<constant; i++) {
				suuji[constant-1-i]=a%100;
				a/=100;
			}
			long ans=0;
			long kai=0;
			long mae=0;
			if(constant<=1) {
				for(int i=10; i>=0; i--) {
					if(suuji[0]>=i*i) {
						return i;
					}
				}
			}
			else {
				for(int i=0; i<constant; i++) {
					mae+=kai*2;
					for(int j=9; j>=0; j--) {
						if((mae*10+j)*j<=suuji[i]) {
							ans=ans*10+j;
							mae*=10;
							kai=j;
							if(i+1<constant) {
								suuji[i+1]+=(suuji[i]-(mae+j)*j)*100;
							}
							break;
						}
					}
				}
			}
			return ans;
		}
		else {
			return 0;
		}
	}
	public static long ketawa(long a, long tei) {
		long sum=0;
		while(a>0) {
			sum+=a%tei;
			a/=tei;
		}
		return sum;
	}
}
