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
		long W=sc.nextLong();
		long[][] mono=new long[N][2];
		for(int i=0; i<N; i++) {
			mono[i][0]=sc.nextLong();
			mono[i][1]=sc.nextLong();
		}
		quick_sort(mono,0,N-1);
		long min0=mono[0][0];
		long[][] sina=new long[4][101];
		int[] counter= {0,0,0,0};
		for(int i=0; i<N; i++) {
			sina[(int)(mono[i][0]-min0)][counter[(int)(mono[i][0]-min0)]]=mono[i][1];
			counter[(int)(mono[i][0]-min0)]++;
		}
		for(int i=0; i<4; i++) {
			Arrays.sort(sina[i]);
		}
		long[][] ruiseki=new long[4][103];
		for(int i=0; i<4; i++) {
			ruiseki[i][0]=0;
			for(int j=0; j<=100; j++) {
				ruiseki[i][j+1]=sina[i][100-j];
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=1; j<=101; j++) {
				ruiseki[i][j]+=ruiseki[i][j-1];
				//pl(ruiseki[i][j]);
			}
		}
		long max=0;
		for(long i=0; i<=counter[0]; i++) {
			for(long j=0; j<=counter[1]; j++) {
				for(long k=0; k<=counter[2]; k++) {
					for(long l=0; l<=counter[3]; l++) {
						long omosa=i*min0+j*(min0+1)+k*(min0+2)+l*(min0+3);
						if(omosa<=W) {
							max=Math.max(max, ruiseki[0][(int)i]+ruiseki[1][(int)j]+ruiseki[2][(int)k]+ruiseki[3][(int)l]);
						}
					}
				}
			}
		}
		pl(max);
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
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}