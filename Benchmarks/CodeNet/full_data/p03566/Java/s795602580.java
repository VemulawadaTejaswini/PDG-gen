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
		int[] time=new int[N];
		for(int i=0; i<N; i++) {
			time[i]=sc.nextInt()*2;
			if(i>0) {
				time[i]+=time[i-1];
			}
		}
		int[] v=new int[N];
		for(int i=0; i<N; i++) {
			v[i]=sc.nextInt()*2;
		}
		int[][] speedlimit=new int[N][time[N-1]+1];
		int[] skd=new int[time[N-1]+1];
		for(int i=0; i<N-1; i++) {
			Arrays.fill(speedlimit[i], 0);
		}
		for(int i=time[N-1]; i>=0; i--) {
			speedlimit[N-1][i]=time[N-1]-i;
		}
		Arrays.fill(skd, 0);
		for(int i=0; i<N; i++) {
			skd[time[i]]=v[i];
		}
		for(int i=time[N-1]; i>=0; i--) {
			if(skd[i]>0) {
				//
			}
			else {
				skd[i]=skd[i+1];
			}
		}
		for(int i=1; i<N; i++) {
			speedlimit[i-1][time[i-1]]=v[i];
		}
		for(int i=0; i<N-1; i++) {
			for(int j=time[i]; j>=0; j--) {
				speedlimit[i][j]=speedlimit[i][time[i]]+Math.abs(time[i]-j);
			}
			for(int j=time[i]+1; j<time[N-1]+1; j++) {
				speedlimit[i][j]=100000000;
			}
		}
		int[] s=new int[time[N-1]+1];
		s[0]=0;
		for(int i=1; i<=time[N-1]; i++) {
			int max=114514810;
			for(int j=0; j<N; j++) {
				max=Math.min(max, speedlimit[j][i]);
			}
			max=Math.min(max, skd[i]);
			if(s[i-1]+1<=max) {
				s[i]=s[i-1]+1;
			}
			else if(s[i-1]==max) {
				s[i]=s[i-1];
			}
			else {
				s[i]=s[i-1]-1;
			}
		}
		int sum=0;
		for(int i=1; i<=time[N-1]; i++) {
			sum+=s[i-1]+s[i];
		}
		pl(((double)sum)/8);
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