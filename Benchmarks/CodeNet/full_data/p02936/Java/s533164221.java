import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	static int[] ans;
	static ArrayList<ArrayList<Integer>> ab;
	static HashMap<Integer, Integer> px = new HashMap<>(); 

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int q = parseInt(sc.next());
//		int[] a = new int[n];
//		int[] b = new int[n];
		ab = new ArrayList<ArrayList<Integer>>(n+1);
		for(i=0;i<=n;i++) {
			ab.add(new ArrayList<Integer>());
		}
		int a,b;
		for(i=0;i<n-1;i++) {
			a = parseInt(sc.next());
			b = parseInt(sc.next());
			ab.get(a).add(b);
		}
//		int[] p = new int[q];
//		int[] x = new int[q];
		int x,p;
		for(i=0;i<q;i++) {
			p = parseInt(sc.next());
			x = parseInt(sc.next());
			if(!px.containsKey(p)) {
				px.put(p, x);
			} else {
				px.put(p, px.get(p)+x);
			}
		}
		sc.close();
		ans = new int[n];
//		for(Integer ii : px.keySet()) {
			add(1, 0);
//		}
		PrintWriter pw = new PrintWriter(out);
		for(i = 0; i < n; i++) {
			pw.print(ans[i]);
			pw.print(" ");
		}
		pw.flush();
	}
	static void add(int p, int x) {
		if(px.containsKey(p)) {
			x += px.get(p);
		}
		ans[p-1] += x;
		for(Integer i : ab.get(p)) {
			add(i, x);
		}
	}
}
