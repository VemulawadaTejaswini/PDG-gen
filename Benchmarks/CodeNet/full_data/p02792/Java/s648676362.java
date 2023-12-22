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
    int[] getHB(int n) {
    	int[] hb = new int[2];
    	hb[1] = n % 10;
    	hb[0] = n;
    	while (n >= 10) {
			hb[0] = n / 10;
			n /= 10;
		}
//    	out.println("n = " + n + "  head = " + hb[0] + "  bottom = " + hb[1]);
    	return hb;
    }
    boolean check(int n, int m) {
    	int[] nhb = getHB(n);
    	int[] mhb = getHB(m);
    	if(nhb[0] == mhb[1] && nhb[1] == mhb[0])
    		return true;
    	else
    		return false;
    }
    long[][] count = new long[10][10];
    public void solve() {
    	int N = ni();
    	int[] hb;
    	for (int i = 1; i <= N; i++) {
    		hb = getHB(i);
        	count[hb[0]][hb[1]]++;
		}
    	long ans = 0;
    	for (int i = 1; i <= N; i++) {
    		hb = getHB(i);
    		ans += count[hb[1]][hb[0]];
		}
    	out.println(ans);
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
