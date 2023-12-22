import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    int N = 0;
    int [] a;
    int [] mask;
    long [][] dp;
    final long INF = 1L << 50;
    void doIt() {
	N = sc.nextInt();
	int M = sc.nextInt();
	a = new int[M];
	mask = new int[M];
	for(int i = 0; i < M; i++) {
	    a[i] = sc.nextInt();
	    int b = sc.nextInt();
	    int v = 0;
	    for(int j = 0; j < b; j++) {
		int c = sc.nextInt() - 1;
		v |= (1<<c);
	    }
	    mask[i] = v;
	}
	dp = new long[M+1][1<<N];
	for(int i = 0; i < dp.length; i++) {
	    for(int j = 0; j < dp[0].length; j++) {
		dp[i][j] = INF;
	    }
	}
	dp[0][0] = 0;
	for(int i = 0; i < M; i++) {
	    for(int j = 0; j < dp[0].length; j++) {
		long cv = dp[i][j];
		long nv = cv + a[i];
		int nj = j | mask[i];
		//System.out.println(i+1 + " " + j + " " + nj);
		dp[i+1][j] = Math.min(dp[i+1][j], cv);
		dp[i+1][nj] = Math.min(dp[i+1][nj], nv);
	    }
	}
	//System.out.println("Answer=");
	long ans = dp[M][(1<<N)-1];
	if(ans >= INF) ans = -1;
	System.out.println(ans);
    }
    
    public static void main(String args[]) {
	new Main().doIt();
    }
}