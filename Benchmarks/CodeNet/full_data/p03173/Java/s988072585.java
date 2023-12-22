import java.io.*;
import java.util.*;


public class Main {

	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	

	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (1e4);
	static List<Integer>[] edges;
    static long[][] dp;
    static int[] a;
    static long[] pre;
    
	
	public static void main(String[] args) throws IOException {
		
	//Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	a = new int[n+1];
	pre = new long[n+1];
	for(int i=1;i<=n;++i) {
		a[i] = sc.nextInt();
		pre[i] = pre[i-1] + a[i];
	}
	
    dp = new long[n+1][n+1];
    for(int i=0;i<=n;++i) Arrays.fill(dp[i], -1);
    out.println(f(1,n));    

out.close();
}
private static long f(int i, int j) {
	if(i >= j) return 0;
	
	if(dp[i][j] != -1) return dp[i][j];
    dp[i][j] = Long.MAX_VALUE;
    
	for(int k=i;k<=j;++k) { // choose a pivot
	long o1 = f(i,k);
	long o2 = f(k+1,j);
    dp[i][j]=Math.min(dp[i][j],o1+o2+pre[j]-pre[i-1]);
	}
	return dp[i][j];
}
	
	}


