import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	static int[] ans;
	static ArrayList<ArrayList<Integer>> ab;

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int q = parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		ab = new ArrayList<ArrayList<Integer>>(n+1);
		for(i=0;i<=n;i++) {
			ab.add(new ArrayList<Integer>());
		}
		for(i=0;i<n-1;i++) {
			a[i] = parseInt(sc.next());
			b[i] = parseInt(sc.next());
			ab.get(a[i]).add(b[i]);
		}
		int[] p = new int[q];
		int[] x = new int[q];
		for(i=0;i<q;i++) {
			p[i] = parseInt(sc.next());
			x[i] = parseInt(sc.next());
		}
		sc.close();
		ans = new int[n];
		for(i=0;i<q;i++) {
			add(p[i], x[i]);
		}
		PrintWriter pw = new PrintWriter(out);
		for(i = 0; i < n; i++) {
			pw.print(ans[i]);
			pw.print(" ");
		}
		pw.flush();
	}
	static void add(int p, int x) {
		ans[p-1] += x;
		for(Integer i : ab.get(p)) {
			add(i, x);
		}
	}
}
