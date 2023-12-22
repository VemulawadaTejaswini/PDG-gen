import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}
 
	public void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		String s = sc.next();
		for (int i = 0; i < mem.length; ++i) {
			for (int j = 0; j < mem[i].length; ++j) {
				mem[i][j] = "";
			}
		}
		System.out.println(f(0, s.length(), s));
	}
 
	String[][] mem = new String[101][101];
 
	// [s,t)
	String f(int s, int t, String S) {
		if (t - s == 1) {
			return "()";
		} else if (t - s < 1) {
			return "";
		}
		if (!mem[s][t].equals("")) {
			return mem[s][t];
		}
		String ans = "";
		for (int m = s + 1; m < t; ++m) {
			// [s,m),[m,t)に分割
			ans = next(ans, f(s, m, S) + f(m, t, S));
		}
		if (S.charAt(s) == '(' && S.charAt(t - 1) == ')') {
			ans = next(ans, "(" + f(s + 1, t - 1, S) + ")");
		} else {
			if (S.charAt(s) == '(')
				ans = next(ans, "(" + f(s + 1, t, S) + ")");
			if (S.charAt(t - 1) == ')') {
				ans = next(ans, "(" + f(s, t - 1, S) + ")");
			}
		}
		//return mem[s][t] = ans;
return ans;
	}
 
	String next(String cur, String ns) {
		if (cur.equals("") || cur.length() > ns.length() || (cur.length() == ns.length() && cur.compareTo(ns) > 0)) {
			return ns;
		} else {
			return cur;
		}
	}
 
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
 
}