import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	static int[] bits=new int[8];
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int[] ngs=new int[3];
		int[] take=new int[N];
		for(int i=0; i<3; i++) {
			ngs[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			take[i]=sc.nextInt();
		}
		int baai=1;
		for(int i=0; i<N; i++) {
			baai*=4;
		}
		int min=114514810;
		for(int i=0; i<baai; i++) {
			int tmp=0;
			int[] kazu=new int[3];
			tori(i);
			if(sanbon()) {
				for(int j=0; j<N; j++) {
					if(bits[j]==1) {
						kazu[0]++;
					}
					else if(bits[j]==2) {
						kazu[1]++;
					}
					else if(bits[j]==3) {
						kazu[2]++;
					}
				}
				int naga=0;
				for(int k=0; k<N; k++) {
					if(bits[k]==1) {
						naga+=take[k];
					}
				}
				tmp+=((kazu[0]-1)*10)+Math.abs(naga-ngs[0]);
				naga=0;
				for(int k=0; k<N; k++) {
					if(bits[k]==2) {
						naga+=take[k];
					}
				}
				tmp+=((kazu[1]-1)*10)+Math.abs(naga-ngs[1]);
				naga=0;
				for(int k=0; k<N; k++) {
					if(bits[k]==3) {
						naga+=take[k];
					}
				}
				tmp+=((kazu[2]-1)*10)+Math.abs(naga-ngs[2]);
				min=Math.min(min, tmp);
			}
		}
		pl(min);
	}
	static void tori(int i) {
		for(int k=0; k<8; k++) {
			bits[k]=i%4;
			i/=4;
		}
	}
	static boolean sanbon() {
		int a=0;
		int b=0;
		int c=0;
		for(int i=0; i<8; i++) {
			if(bits[i]==1) {
				a=1;
			}
			else if(bits[i]==2) {
				b=1;
			}
			else if(bits[i]==3) {
				c=1;
			}
		}
		if(a+b+c==3) {
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