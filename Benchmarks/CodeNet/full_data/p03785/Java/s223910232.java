package main;

import java.io.PrintWriter;
import java.io.InputReader;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
	int n = in.nextInt();
	int c = in.nextInt();
	int k = in.nextInt();
	int[] t = new int[n];
	for (int i = 0; i < n; i++) {
	    t[i] = in.nextInt();
	}
	Arrays.sort(t);
	int people = 0;
	int start = 0;
	int res = 0;
	for (int tt : t) {
	    if (people == 0) {
		start = tt;
		++people;
	    }
	    else if ((tt <= (start + k)) && (people < c)) {
		++people;
	    }
	    else {
		++res;
		start = tt;
		people = 1;
	    }
	}
	++res;
	out.println(res);
    }
}
