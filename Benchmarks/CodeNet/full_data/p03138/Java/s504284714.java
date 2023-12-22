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
import java.util.Objects;
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
    int N;
    long K;
    long[] A;
    int[] C;
    long calc2(long X) {
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += (X^A[i]);
		}
//		out.println("  X = " + X + "  -->  ans = " + ans);
		return ans;
    }
    long calc(int now, long X) {
//    	out.println("start calc   now = " + now + " X = " + X);
    	for (int i = now; i >= 0; i--) {
//    		out.println("  loop  i = " + i + "  C[" + i + "] = " + C[i]);
			if(N - C[i] > C[i]) {	// ０が多ければ、１を立てる
				X += (1L << i);
			}
		}
		return calc2(X);
    }
    public void solve() {
    	N = ni();
    	K = nl();
    	A = new long[N];
    	C = new int[64];
    	for (int i = 0; i < N; i++) {
			A[i] = nl();
			for (int j = 0; j < 64; j++) {
				if(((A[i] >> j) & 1L) != 0) {
					C[j]++;
				}
			}
		}
    	long X = 0, ans = calc2(0);
		for (int j = 63; j >= 0; j--) {
			if(((K >> j) & 1L) == 0)	continue;
			ans = Math.max(ans, calc(j-1, X));
			X += (1L << j);
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
