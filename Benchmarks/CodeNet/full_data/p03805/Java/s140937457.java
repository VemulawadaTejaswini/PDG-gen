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
    int N, M;
    int[][] A;
    boolean[] used;
    int calc(int now, int cnt) {
//    	out.println("開始　　now = " + now + "  cnt = " + cnt);
    	if(cnt >= N-1) {
//        	out.println("見つかった！　　now = " + now + "  cnt = " + cnt);
    		return 1;
    	}
    	int ans = 0;
    	for (int i = 0; i < N; i++) {
			if(A[now][i] == 1 && !used[i]) {
				used[i] = true;
				ans += calc(i, cnt+1);
				used[i] = false;
			}
		}
//    	out.println("戻り　　 now = " + now + "  cnt = " + cnt + "  --> ans = " + ans);
    	return ans;
    }
    public void solve() {
    	N = ni();
    	M = ni();
    	A = new int[N][N];
    	used = new boolean[N];
    	int x, y;
    	for (int i = 0; i < M; i++) {
			x = ni() - 1;
			y = ni() - 1;
			A[x][y] = 1;
			A[y][x] = 1;
		}
    	used[0] = true;
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
