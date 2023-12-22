import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

class Main implements Runnable {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		new Main().run();
		// new Thread(null, new Main(), "",
		// Runtime.getRuntime().maxMemory()).start();
		System.err.println(System.currentTimeMillis() - t);
	}

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int c = 0;
		String ans = "";
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == '(') {
				++c;
			} else {
				--c;
			}
			if (c == -1) {
				ans = '(' + ans;
				c = 0;
			}
			ans=ans+s.charAt(i);
		}
		while (c > 0) {
			ans = ans + ')';
			--c;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}