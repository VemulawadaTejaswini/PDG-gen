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
		int C=sc.nextInt();
		int[] channels=new int[200003];
		Arrays.fill(channels, 0);
		int[] channel=new int[31];
		channel[0]=1;
		for(int i=1; i<31; i++) {
			channel[i]=channel[i-1]*2;
		}
		for(int i=0; i<N; i++) {
			int from=sc.nextInt()*2-1;
			int to=sc.nextInt()*2;
			int ch=sc.nextInt()-1;
			channels[from]+=channel[ch];
			channels[to]+=(-channel[ch]);
			//pl(from+" "+to+" "+ch);
		}
		for(int i=1; i<200003; i++) {
			channels[i]=channels[i]+channels[i-1];
		}
		int honsu=0;
		for(int i=0; i<200003; i++) {
			honsu=Math.max(honsu,pop(channels[i]));
		}
		pl(honsu);
		/*for(int i=0; i<40; i++) {
			pl(channels[i]);
		}*/
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
	public static int pop(int a) {
		int ans=0;
		for(int i=0; i<32; i++) {
			if(a%2==1) {
				ans++;
			}
			a/=2;
		}
		return ans;
	}
}