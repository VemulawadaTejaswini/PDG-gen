import java.util.*;
import java.io.*;
import java.math.*;
class Main{
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		String s1 = " "+sc.next();
		String s2 = " "+sc.next();
		int n = s1.length();
		int m = s2.length();
		int dp[][] = new int[n+2][m+2];
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				if(s1.charAt(i)==s2.charAt(j))
					dp[i][j] = dp[i-1][j-1]+1;
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	
		
		StringBuilder sb = new StringBuilder();
		int x = n-1;
		int y = m-1;
		while(x>0 && y>0){
			if(dp[x][y-1]==dp[x][y]){
				y-=1;
				//System.out.println("a");
			}else if(dp[x-1][y]==dp[x][y]){
				x-=1;
				//System.out.println("b");
			}else if(dp[x-1][y-1]+1==dp[x][y]){
				sb.append(s1.charAt(x));
				//System.out.println("c");
				y-=1;
				x-=1;
			}
		}
		String fg = sb.reverse().toString();
		System.out.println(fg);
		
	}
	
	public static class pair{
		int count;
		StringBuilder sb = new StringBuilder();
	}
	public static int gentype(int min, int max){
		return new Random().nextInt((max - min) + 1) + min;
	}	
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer sz;


		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (sz == null || !sz.hasMoreTokens()) {
				try {
					sz = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return sz.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}

}
