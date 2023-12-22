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
    int N;
    int[] L;
    int[] ABC = new int[3], WK = new int[3];
    int calc(int now, int mp) {
    	if(now >= N) {
    		for (int i = 0; i < 3; i++) {
    			if(WK[i] == 0)		return 999999999;
				mp += Math.abs(ABC[i] - WK[i]);
			}
    		return mp;
    	}
    	int ans = 999999999;
    	ans = Math.min(ans, calc(now+1, mp));
    	for (int i = 0; i < 3; i++) {
    		if(WK[i] == 0) {
    			WK[i] += L[now];
    			ans = Math.min(ans, calc(now+1, mp));
    			WK[i] -= L[now];
    		} else {
    			WK[i] += L[now];
    			ans = Math.min(ans, calc(now+1, mp + 10));
    			WK[i] -= L[now];
    		}
		}
    	return ans;
    }
    public void solve() {
    	N = Integer.parseInt(sc.next());
    	ABC[0] = Integer.parseInt(sc.next());
    	ABC[1] = Integer.parseInt(sc.next());
    	ABC[2] = Integer.parseInt(sc.next());
    	L = new int[N];
    	for (int i = 0; i < N; i++) {
			L[i] = Integer.parseInt(sc.next());
		}
    	out.println(calc(0, 0));
    }
}
