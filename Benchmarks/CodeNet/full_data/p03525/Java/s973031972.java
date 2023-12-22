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
		int[] hrs=new int[13];
		Arrays.fill(hrs,0);
		int N=sc.nextInt();
		int [] times=new int[N+1];
		times[0]=0;
		for(int i=0; i<N; i++) {
			times[i+1]=sc.nextInt();
			hrs[times[i+1]]++;
		}
		/*
		 *
		 * 0時がある時点で最大が12時間。まぁという感じ
		 *
		 */
		int syurui=0;
		for(int i=0; i<=12; i++) {
			if(hrs[i]>0) {
				syurui++;
			}
		}
		for(int i=0; i<13; i++) {
			if(hrs[i]>2) {
				pl(0);
				System.exit(0);
			}
		}//同じ時差が3人以上いると、鳩ノ巣理論で0

		int determined=0;
		for(int i=0; i<13; i++) {
			if(hrs[i]==2) {
				determined++;
			}
		}
		int[] d=new int[determined];
		int cnt=0;
		for(int i=0; i<13; i++) {
			if(hrs[i]==2) {
				d[cnt]=i;
				cnt++;
			}
		}
		int[] calc=new int[N-determined];
		int counter=0;
		for(int i=0; i<13; i++) {
			if(hrs[i]==1) {
				calc[counter]=i;
				counter++;
			}
		}
		int[] locked=new int[determined*2+1];
		locked[0]=0;
		for(int i=0; i<determined; i++) {
			for(int j=0; j<2; j++) {
				locked[i*2+1]=d[i];
				locked[i*2+2]=24-d[i];
			}
		}
		int p=1;
		for(int i=0; i<N-determined; i++) {
			p*=2;
		}
		int[] sum=new int[N+1];
		int maxi=0;
		for(int i=0; i<p; i++) {
			for(int j=0; j<determined*2+1; j++) {
				sum[j]=locked[j];
			}
			int tmp=i;
			for(int j=0; j<N-determined*2; j++) {
				if(tmp%2==0) {
					sum[determined*2+1+j]=calc[j];
				}
				if(tmp%2==1) {
					sum[determined*2+1+j]=24-calc[j];
				}
				tmp/=2;
			}
			Arrays.sort(sum);
			int dif=24;
			for(int j=1; j<=N; j++) {
				dif=Math.min(dif, sum[j]-sum[j-1]);
			}
			dif=Math.min(dif, 24-sum[N]);
			maxi=Math.max(maxi, dif);
		}
		pl(maxi);
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