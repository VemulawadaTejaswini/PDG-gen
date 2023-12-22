import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==========================================================
    public void solve() {
    	int N = ni();
    	int[] A = ndi(N);
    	long[] wa = new long[N+1];
    	for (int i = 1; i <= N; i++) {	// 累積和
			wa[i] = wa[i-1] + A[i-1];
		}
    	long[][] dp = new long[N+1][N+1];
    	int j;
    	long sv;
    	for (int len = 2; len <= N+1; len++) {
			for (int i = 0; i + len <= N; i++) {
				j = i + len;
				sv = 1000000000000000000L;
				for (int k = i+1; k < j; k++) {
					sv = Math.min(sv, 
							dp[i][k] + dp[k][j] + wa[j] - wa[i]);
//					out.println("i = " + i + "  j = " + j + "  k = " + k
//							+ "  dp[" + i + "][" + k + "] = " + dp[i][k]
//							+ "  dp[" + k + "][" + j + "] = " + dp[k][j]
//							+ "  wa[" + j + "] = " + wa[j] 
//							+ "  wa[" + i + "] = " + wa[i]
//							+ " --> " + (wa[j]-wa[i])
//							+ "  wa[" + i + "][" + j + "] = " + dp[i][j]);
				}
				dp[i][j] = sv;
			}
		}
    	out.println(dp[0][N]);
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return sc.nextInt();
    }
    public long nl() {
    	return sc.nextLong();
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] nddi(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
