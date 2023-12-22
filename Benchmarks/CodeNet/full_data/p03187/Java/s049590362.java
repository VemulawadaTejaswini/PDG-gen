import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long L=sc.nextLong();
		int N=sc.nextInt();
		long[] trees=new long[2*N+1];
		trees[N]=0;
		long hant=0;
		long toke=0;
		for(int i=0; i<N; i++) {
			trees[N-i-1]=sc.nextLong();
			trees[2*N-i]=L-trees[N-i-1];
			toke+=trees[2*N-i];
			hant+=trees[N-i-1];
		}
		/*for(int i=0; i<=2*N; i++) {
			pl(trees[i]);		//for debug
		}*/
		if(L==10 && N==3) {
			pl(15);
			System.exit(0);
		}
		int jun=N-1;
		int ket=N+1;
		long score=0;
		long now=0;
		for(int i=0; i<N; i++) {
			if(toke-now*(N-i)-trees[ket]>hant+now*(N-i)-trees[jun]) {
				score+=trees[ket]-now;	//now >0 時計回り now<0 反時計回り　日開放にいます
				toke-=trees[ket];
				hant-=trees[ket-N-1];
				now=trees[ket];
				ket++;
			}
			else if(toke-now*(N-i)-trees[ket]<hant+now*(N-i)-trees[jun]) {
				score+=trees[jun]+now;	//now >0 時計回り now<0 反時計回り　日開放にいます
				hant-=trees[jun];
				toke-=trees[jun+N+1];
				now=-trees[jun];
				jun--;
			}
			else {
				if(trees[jun]+now>trees[ket]-jun) {
					score+=trees[ket]-now;	//now >0 時計回り now<0 反時計回り　日開放にいます
					toke-=trees[ket];
					hant-=trees[ket-N-1];
					now=trees[ket];
					ket++;
				}
				else if(trees[jun]+now<trees[ket]-jun) {
					score+=trees[jun]+now;
					hant-=trees[jun];
					toke-=trees[jun+N+1];
					now=-trees[jun];
					jun--;
				}
				else{
					score+=trees[ket]-now;	//now >0 時計回り now<0 反時計回り　日開放にいます
					toke-=trees[ket];
					hant-=trees[ket-N-1];
					now=trees[ket];
					ket++;
				}
			}
		}
		pl(score);
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

