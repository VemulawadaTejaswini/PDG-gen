import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int N=sc.nextInt();
		long[] kosu=new long[10];
		Arrays.fill(kosu, 0);
		HashMap<Long,Integer> dots=new HashMap<Long,Integer>();	//多分Longしか使わない
		kosu[0]=((long)H-2)*((long)W-2);
		//pl(kosu[0]);
		long MOD=1_000_000_007;
		for(int i=0; i<N; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			Long coord=x*MOD+y;
			long[] mae=new long[10];
			long[] ato=new long[10];
			Arrays.fill(mae, 0);
			Arrays.fill(ato, 0);
			for(int k=-1; k<=1; k++) {
				for(int l=-1; l<=1; l++) {
					//中心
					if(x+k>1 && x+k<W) {
						if(y+l>1 && y+l<H) {
							int tmp=0;
							for(int m=-1; m<=1; m++) {
								for(int n=-1; n<=1; n++) {
									if(dots.containsKey((x+k+m)*MOD+(y+l+n))){
										tmp++;
									}
								}
							}
							mae[tmp]++;
						}
						else {
							//continue;
						}
					}
					else {
						//continue;
					}
					//
				}
			}
			dots.put(coord, 0);
			for(int k=-1; k<=1; k++) {
				for(int l=-1; l<=1; l++) {
					//中心
					if(x+k>1 && x+k<W) {
						if(y+l>1 && y+l<H) {
							int tmp=0;
							for(int m=-1; m<=1; m++) {
								for(int n=-1; n<=1; n++) {
									if(dots.containsKey((x+k+m)*MOD+(y+l+n))){
										tmp++;
									}
								}
							}
							ato[tmp]++;
						}
						else {
							//continue;
						}
					}
					else {
						//continue;
					}
					//
				}
			}
			for(int l=0; l<10; l++) {
				kosu[l]-=mae[l];
				kosu[l]+=ato[l];
			}
		}
		for(int i=0; i<10; i++) {
			pl(kosu[i]);
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
