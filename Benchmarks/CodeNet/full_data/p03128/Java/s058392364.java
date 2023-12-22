import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main{
	static int[] dp;
	static int[] Match= {6,2,5,5,4,5,6,3,7,6};
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		StringBuilder sb=new StringBuilder();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] useable=new int[M];
		for(int i=0; i<M; i++) {
			useable[i]=sc.nextInt();
		}
		dp=new int[N+1];
		Arrays.fill(dp, -200);
		dp[0]=0;
		for(int i=0; i<=N; i++) {
			for(int j=0; j<M; j++) {
				if(i-Match[useable[j]]>=0) {
					dp[i]=Math.max(dp[i], dp[i-Match[useable[j]]]+1);
				}
			}
		}
		int keta = dp[N];		//桁
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<keta; i++) {
			int suji=0;	//今から決める数字
			for (int j = 0; j < M; j++) {
				if (N >= Match[useable[j]] && dp[N] - dp[N - Match[useable[j]]] == 1) {
					suji = Math.max(suji, useable[j]);
				}
			}
			list.add(suji);
			N-=Match[suji];
		}
		Collections.sort(list);
		sb = new StringBuilder();
		for (int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
		System.out.println(sb.toString());
	}
	public static boolean Bigger(String a,String b) {//前者のほうが大きいとTrue、そうでなければFalse
		if(a.length()>b.length()) {
			return true;
		}
		else if(a.length()<b.length()) {
			return false;
		}
		else {
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j)>b.charAt(j)) {
					return true;
				}
				else if(a.charAt(j)<b.charAt(j)) {
					return false;
				}
			}
		}
		return true;
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
}