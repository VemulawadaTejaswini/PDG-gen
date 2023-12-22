import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static long[] kosu;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long[] bits=new long[48];
		bits[0]=1L;
		for(int i=1; i<48; i++) {
			bits[i]=bits[i-1]*2;
		}
		kosu=new long[48];
		for(int i=0; i<48; i++) {
			kosu[i]=0;
		}

		for(int i=0; i<48; i++) {
			kosu_p(i,B);
			if(A>0) {
				kosu_d(i,A-1);
			}
		}
		for(int i=0; i<48; i++) {
			kosu[i]%=2;
		}
		long ans=0;
		for(int i=0; i<48; i++) {
			ans+=kosu[i]*bits[i];
		}
		pl(ans);
	}
	public static void kosu_p(int bits,long range) {
		long nijyo=1L;
		for(int i=0; i<=bits; i++) {
			nijyo*=2;
		}
		long tmp=0;
		if(bits==0) {
			tmp=(range+1)/2L;
			kosu[bits]+=tmp;
		}
		else {
			tmp=((range+1)/nijyo)*(nijyo/2);
			long amr=(range+1)%nijyo;
			if(amr>nijyo/2) {
				tmp+=amr-nijyo/2;
			}
			kosu[bits]+=tmp;
		}
	}
	public static void kosu_d(int bits,long range) {
		long nijyo=1L;
		for(int i=0; i<=bits; i++) {
			nijyo*=2;
		}
		long tmp=0;
		if(bits==0) {
			tmp=(range+1)/2L;
			kosu[bits]-=tmp;
		}
		else {
			tmp=((range+1)/nijyo)*(nijyo/2);
			long amr=(range+1)%nijyo;
			if(amr>nijyo/2) {
				tmp+=amr-nijyo/2;
			}
			kosu[bits]-=tmp;
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