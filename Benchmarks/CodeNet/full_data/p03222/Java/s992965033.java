import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

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
    // ======================================================================
    final long MOD = (long)1e9 + 7;
    int H, W, K;
    long[][] memo;
    // 横棒が連続していないかをチェックする　→　連続していたら　-1 を返す
    // 縦棒　p の次の移動先を返す
    int check(int n, int p) {
    	int ans = p;
    	boolean f = false;
    	for (int i = 0; i < W -1; i++) {
			if((n & (1 << i)) != 0) {
				if(f) {
					ans = -1;
					break;
				} else {
					f = true;
					if(i == p)					ans++;
					else if(p > 0 && i == p-1)	ans--;
				}
			} else {
				f = false;
			}
		}
    	return ans;
    }
    long calc(int now, int p) {
    	if(now >= H) {
    		if(p == K)	return 1;
    		else		return -1;
    	}
    	if(memo[now][p] != -1)	return memo[now][p];
    	long ans = 0, wk;
    	int nextP = p;
    	for (int i = 0; i < (1 << (W-1)); i++) {
    		nextP = check(i, p);
			if(nextP == -1)		continue;
			wk = calc(now + 1, nextP);
			if(wk == -1)	continue;
			ans = (ans + wk) % MOD;
		}
    	return memo[now][p] = ans;
    }
	public void solve() {
		H = ni();
		W = ni();
		K = ni() - 1;
		memo = new long[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(memo[i], -1);
		}
		out.println(calc(0, 0));
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
