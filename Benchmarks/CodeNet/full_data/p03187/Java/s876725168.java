import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens()) {
				String cad = br.readLine();
				if (cad == null)
					return null;
				tk=new StringTokenizer(cad);
			}
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	static int L;
	static int N;
	static int[] X;
	static Long[][][] dp;
	
	
	static long dp(int left, int right, int last_left) {
		if (left + 1 == right)
			return 0;
		if (dp[left][right][last_left] != null)
			return dp[left][right][last_left];
		long first, second;
		if (last_left == 1) {
			first = X[left + 1] - X[left] + dp(left + 1, right, 1);
			second = X[left] + (L - X[right - 1]) + dp(left, right - 1, 0);		
		}
		else {
			first = X[right] - X[right - 1] + dp(left, right - 1, 0);
			second = (L - X[right]) + X[left + 1] + dp(left + 1, right, 1);
		}
		long ans = Math.max(first, second);
		dp[left][right][last_left] = ans;
		return ans;
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		L = sc.nextInt();
		N = sc.nextInt();
		X = new int[N + 2];
		for(int i = 0; i < N; i++)
			X[i + 1] = sc.nextInt();
		X[0] = 0;
		X[N + 1] = L;
		dp = new Long[N + 2][N + 2][2];
		System.out.println(dp(0, N + 1, 1));
	}

}
