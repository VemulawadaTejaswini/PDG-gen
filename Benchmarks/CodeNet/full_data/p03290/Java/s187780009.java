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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
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
    // ==================================================================
    public void solve() {
    	int D = ni();
    	long G = nl();
    	int[][] PC = ndii(D,2);
    	long total, cnt, ans = 10000;
    	for (int i = 0; i < (1 << D); i++) {
			total = cnt = 0;
    		for (int j = 0; j < D; j++) {
				if(((i >> j) & 1) == 1) {
					total += (PC[j][0] * (j+1) * 100 + PC[j][1]);
					cnt += PC[j][0];
				}
			}
    		if(total >= G) {
    			ans = Math.min(ans, cnt);
    			continue;
    		}
    		LOOP:
    		for (int j = D-1; j >= 0; j--) {
				if(((i >> j) & 1) == 0) {		// 点数が高くて、コンプリートしていないもの
					for (int j2 = 0; j2 < PC[j][0] - 1; j2++) {
						total += (j+1) * 100;
						cnt++;
						if(total >= G) {
			    			ans = Math.min(ans, cnt);
							break LOOP;
						}
					}
					break LOOP;
				}
    		}
		}
    	out.println(ans);
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return Integer.parseInt(sc.next());
    }
    public long nl() {
    	return Long.parseLong(sc.next());
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
    public int[][] ndii(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
