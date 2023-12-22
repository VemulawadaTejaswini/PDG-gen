import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE, max = -1;
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        if (max - min > 1) {
            out.println("No");
        } else if (max == min) {
            if (n == min + 1 || n >= min*2) out.println("Yes");
            else out.println("No");
        } else {
            int cnt = 0;
            for (int i=0; i<n; i++) {
                if (a[i] == min) cnt++;
            }
            if (cnt == min) out.println("Yes");
            else out.println("No");
        }
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}