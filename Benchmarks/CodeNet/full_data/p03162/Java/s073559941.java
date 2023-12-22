import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
	private static void solve(FastScanner fr) {
		int n = fr.nextInt();
		int[][] h = new int[n][3];
		for(int i = 0; i < n; i++) {
			h[i] = fr.readArray(3);
		}
		int[][] dp = new int[n][3];
		dp[0] = h[0];
		int max = Math.max(h[0][0], Math.max(h[0][1], h[0][2]));
		for(int i = 1; i < n; i++) {			
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j == k) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + h[i][j]);
				}
				max = Math.max(max, dp[i][j]);
			}
		}

		sout(max);
	}
    public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = 1;
		// int n = fs.nextInt();
		while (n-- > 0)	{
			solve(fs);
        }
    }

    private static void sout()          { System.out.println();  }
    private static void sout(String s)  { System.out.println(s); }
    private static void sout(int s)     { System.out.println(s); }
    private static void sout(long s)    { System.out.println(s); }
    private static void sout(double s)  { System.out.println(s); }
    
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { st=new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
			return st.nextToken();
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
