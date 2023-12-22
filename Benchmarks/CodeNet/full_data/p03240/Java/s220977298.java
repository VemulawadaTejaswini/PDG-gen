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
	public void solve() {
		int N = ni();
		int[][] XYH = new int[N][3];
		int[] sv = new int[3];
		for (int i = 0; i < N; i++) {
			XYH[i][0] = ni();
			XYH[i][1] = ni();
			XYH[i][2] = ni();
			if(XYH[i][2] > 0 && sv[2] == 0) {
				sv[0] = XYH[i][0];
				sv[1] = XYH[i][1];
				sv[2] = XYH[i][2];
			}
		}
		boolean f;
		int wk, h;
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				f = true;
				h = sv[2] + Math.abs(sv[0] - x) + Math.abs(sv[1] - y);
				if(h < 1)	continue;
//				out.println("h = " + h + "  x = " + x + " y = " 
//					+ y + "  sv = [" + sv[0] + "][" + sv[1] + "][" + sv[2] + "]");
				for (int i = 0; i < N; i++) {
					wk = Math.max(h - Math.abs(XYH[i][0] - x)
									- Math.abs(XYH[i][1] - y), 0);
					if(wk != XYH[i][2]) {
						f = false;
						break;
					}
				}
				if(f) {
					out.println(x + " " + y + " " + h);
					return;
				}
			}
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
