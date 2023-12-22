import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long mod=1000000007l;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		String s=sc.next();
		if(Math.max(A,B)<=Math.min(C, D)) {
			boolean Aok=false;
			boolean Bok=false;
			//(A,B) (C,D)の順に並んでい
			if(A<=B && C<=D) {
				long[] dp=new long[N+1];
				Arrays.fill(dp, 0);
				dp[B]=1;
				for(int i=B+1; i<=D; i++) {
					if(i==B+1) {
						if(s.charAt(B)=='#') {
							dp[B+1]=0;
						}
						else {
							dp[B+1]=1;
						}
					}
					else {
						if(s.charAt(i-1)=='#') {
							dp[i]=0;
						}
						else {
							dp[i]=dp[i-1]+dp[i-2];
							dp[i]%=mod;
						}
					}
				}
				if(dp[D]>=1) {
					Bok=true;
				}
				Arrays.fill(dp, 0);
				dp[A]=1;
				for(int i=A+1; i<=C; i++) {
					if(i==A+1) {
						if(s.charAt(A)=='#') {
							dp[A+1]=0;
						}
						else {
							dp[A+1]=1;
						}
					}
					else {
						if(s.charAt(i-1)=='#') {
							dp[i]=0;
						}
						else {
							dp[i]=dp[i-1]+dp[i-2];
							dp[i]%=mod;
						}
					}
				}
				if(dp[C]>=1) {
					Aok=true;
				}
				if(Aok && Bok) {
					pl("Yes");
				}
				else {
					pl("No");
				}
			}
			else if(A<=B && D<=C) {
				boolean ok=false;
				for(int i=B-1; i<=Math.min(D-1,N-2); i++) {
					if(s.charAt(i-1)=='.' && s.charAt(i)=='.' && s.charAt(i+1)=='.') {
						ok=true;
						break;
					}
				}
				if(ok) {
					pl("Yes");
				}
				else {
					pl("No");
				}
			}
		}
		else {
			boolean Aok=false;
			boolean Bok=false;
			//(A,B) (C,D)の順に並んでい
			if(A<=B && C<=D) {
				long[] dp=new long[N+1];
				Arrays.fill(dp, 0);
				dp[B]=1;
				for(int i=B+1; i<=D; i++) {
					if(i==B+1) {
						if(s.charAt(B)=='#') {
							dp[B+1]=0;
						}
						else {
							dp[B+1]=1;
						}
					}
					else {
						if(s.charAt(i-1)=='#') {
							dp[i]=0;
						}
						else {
							dp[i]=dp[i-1]+dp[i-2];
							dp[i]%=mod;
						}
					}
				}
				if(dp[D]>=1) {
					Bok=true;
				}
				Arrays.fill(dp, 0);
				dp[A]=1;
				for(int i=A+1; i<=C; i++) {
					if(i==A+1) {
						if(s.charAt(A)=='#') {
							dp[A+1]=0;
						}
						else {
							dp[A+1]=1;
						}
					}
					else {
						if(s.charAt(i-1)=='#') {
							dp[i]=0;
						}
						else {
							dp[i]=dp[i-1]+dp[i-2];
							dp[i]%=mod;
						}
					}
				}
				if(dp[C]>=1) {
					Aok=true;
				}
				if(Aok && Bok) {
					pl("Yes");
				}
				else {
					pl("No");
				}
			}
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