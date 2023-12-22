import java.awt.Robot;
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
    final int MAX = 1000000000;
    int N, A, B, C;
    int[] L;
    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>();
    Set<Integer> setC = new HashSet<>();
    int calc2(int a, Set<Integer> set) {
    	int wk = 0;
    	for(int x : set) {
    		wk += x;
    	}
    	int ans = (set.size() - 1) * 10 + Math.abs(a - wk);
    	return ans;
    }
    int calc(int now) {
    	int ans = MAX;
    	if(now == N) {
    		if(setA.size() == 0 || setB.size() == 0 || setC.size() == 0)
    			return ans;
    		ans = calc2(A, setA);
    		ans += calc2(B, setB);
    		ans += calc2(C, setC);
    		return ans;
    	}
    	ans = Math.min(ans, calc(now+1));
    	setA.add(L[now]);
    	ans = Math.min(ans, calc(now+1));
    	setA.remove(L[now]);
    	setB.add(L[now]);
    	ans = Math.min(ans, calc(now+1));
    	setB.remove(L[now]);
    	setC.add(L[now]);
    	ans = Math.min(ans, calc(now+1));
    	setC.remove(L[now]);
    	return ans;
    }
    public void solve() {
    	N = ni();
    	A = ni();
    	B = ni();
    	C = ni();
    	L = ndi(N);
    	out.println(calc(0));
    }
    // Set に入れるなら　PPKEY　を使う！
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
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
