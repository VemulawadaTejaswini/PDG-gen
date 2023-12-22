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
    int N, M;
    Map<Integer, List<Integer>> map = new HashMap<>();
    int[] memo;
    boolean[] f;
    int calc(int now) {
//    	out.println("calc start  now = " + now);
    	if(memo[now] != -1) {
//    		out.println("   return memo = " + memo[now]);
    		return memo[now];
    	}
    	int ans = 0;
    	List<Integer> list = map.get(now);
    	if(list == null)	return 0;
    	for(int y : list) {
    		if(f[y])	continue;
    		f[y] = true;
    		ans = Math.max(ans, calc(y) + 1);
    		f[y] = false;
    	}
//    	out.println("  --> now = " + now + "  return " + ans + "\n");
    	return memo[now] = ans;
    }
    public void solve() {
    	N = ni();
    	M = ni();
    	memo = new int[N];
    	f = new boolean[N];
    	int x, y;
    	List<Integer> list;
    	for (int i = 0; i < M; i++) {
			x = ni() - 1;
			y = ni() - 1;
			list = map.get(x);
			if(list == null) {
				list = new ArrayList<>();
				map.put(x, list);
			}
			list.add(y);
		}
    	int ans = 0;
    	for (int i = 0; i < N; i++) {
        	Arrays.fill(memo, -1);
        	Arrays.fill(f, false);
        	f[i] = true;
			ans = Math.max(ans, calc(i));
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
