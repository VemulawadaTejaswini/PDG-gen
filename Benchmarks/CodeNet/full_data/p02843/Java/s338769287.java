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
    int X;
    int[] mem = new int[100010];
    public int calc(int total) {
    	if(total == X)			return 1;		// true
    	if(total > X)			return 0;		// false
    	if(mem[total] != -1)	return mem[total];
    	int ans = 0;
    	for (int i = 100; i <= 105; i++) {
			ans = Math.max(ans, calc(total + i));
		}
    	return mem[total] = ans;
    }
    public void solve() {
    	X = Integer.parseInt(sc.next());
    	Arrays.fill(mem, -1);
    	out.println(calc(0));
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
