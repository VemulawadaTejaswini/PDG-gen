import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
    int INF = 1000000000;
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	char[] C = sc.next().toCharArray();
    	int[] P1 = new int[30010];
    	HashSet<Integer> set = new HashSet<>();
    	HashSet<Integer> set2 = new HashSet<>();
    	for (int i = N - 1; i >= 0; i--) {
    		if(!set.contains((int)(C[i]-'0'))) {
    			set.add((int)(C[i]-'0'));
    			P1[i] = P1[i+1] + 1;
    		} else {
    			P1[i] = P1[i+1];
    		}
		}
    	set.clear();
    	int ans = 0;
    	for (int i = 0; i < N; i++) {
    		if(!set.contains((int)(C[i]-'0'))) {
    			set.add((int)(C[i]-'0'));
    			set2.clear();
    			for (int j = i+1; j < N; j++) {
    	    		if(!set2.contains((int)(C[j]-'0'))) {
    	    			set2.add((int)(C[j]-'0'));
    	    			ans += P1[j+1];
    	    		}
				}
    		}
		}
    	out.println(ans);
    }
    // ==================================================================
}
class PP{
	public int key, val;
	public PP(int key, int val) {
		this.key = key;
		this.val = val;
	}
	public int getKey() {
		return key;
	}
	public int getVal() {
		return val;
	}
}
