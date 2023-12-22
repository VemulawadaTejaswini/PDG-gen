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
    int[][] P = new int[30010][10];
    public void solve() {
    	int N = ni();
    	char[] C = ns().toCharArray();
    	int[] m = new int[10];
    	Arrays.fill(m, -1);
    	Arrays.fill(P[N], -1);
    	int wk;
    	for (int i = N-1; i >= 0; i--) {
    		wk = (int)(C[i]-'0');
//    		out.println("wk = " + wk + "  i = " + i);
    		m[wk] = i+1;
    		for (int j = 0; j < 10; j++) {
    			P[i][j] = m[j];
			}
		}
//    	for (int i = 0; i <= N; i++) {
//    		for (int j = 0; j < 10; j++) {
//				out.print((P[i][j] == -1 ? "* " : P[i][j] + " "));
//			}
//    		out.println("");
//		}
    	Set<Integer> set = new HashSet<>();
    	int next_1, next_2;
    	for (int n = 0; n < N-2; n++) {
	    	for (int i = 0; i < 10; i++) {
//				out.println("　１　数字[" + i + "]  P[" + n + "][" + i + "] = " + P[n][i]);
				if(P[n][i] == -1)		continue;
				next_1 = P[n][i];
				for (int j = 0; j < 10; j++) {
//					out.println("　２　数字[" + j + "]  P[" + next_1 + "][" + j + "] = " + P[next_1][j]);
					if(P[next_1][j] == -1)	continue;
					next_2 = P[next_1][j];
					for (int j2 = 0; j2 < 10; j2++) {
//						out.println("　３　数字[" + j2 + "]  P[" + next_2 + "][" + j2 + "] = " + P[next_2][j2]);
						if(P[next_2][j2] == -1)	continue;
						set.add(i*100 + j * 10 + j2);
//						out.println("  見つかった  [" + i + " " + j + " " + j2 + " ]");
					}
				}
			}
    	}
    	out.println(set.size());
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
