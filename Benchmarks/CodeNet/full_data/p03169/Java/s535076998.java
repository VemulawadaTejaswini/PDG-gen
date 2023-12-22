import java.util.*;

class Main {
	static int n;
	static double[][][] dp;

	public static double dfs(int a, int b, int c) {
		if(a == 0 && b == 0 && c == 0) return 0;

		if(dp[a][b][c] == -1) {
			dp[a][b][c] = 1.0;
			if(a > 0)
				dp[a][b][c] += (1.0*a/n) * dfs(a-1, b+1, c);
			if(b > 0)
				dp[a][b][c] += (1.0*b/n) * dfs(a, b-1, c+1);
			if(c > 0)
				dp[a][b][c] += (1.0*c/n) * dfs(a, b, c-1);
			dp[a][b][c] /= 1-(1.0*(n-(a+b+c))/n);
		}

		return dp[a][b][c];
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	n = sc.nextInt();
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	for(int i = 0; i < n; i++) {
    		int tmp = sc.nextInt();
    		if(tmp == 3) a++;
    		if(tmp == 2) b++;
    		if(tmp == 1) c++;
    	}

    	dp = new double[n+1][n+1][n+1];
    	for(double[][] i : dp) for(double[] j : i) Arrays.fill(j, -1);

    	System.out.println(dfs(a, b, c));
    }
}