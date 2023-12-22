import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] x = new int[N];
		List<Integer> templ = new ArrayList<>();
		List<Integer> tempr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			x[i] = t;

			if (t > 0) {
				tempr.add(t);
			} else if (t < 0) {
				templ.add(t * -1);
			} else {
				K--; // 点0は移動しないで付けられるので。
			}
		}
		sc.close();

		if (K == 0) {
			out.println(0);
			return;
		}

		templ.sort(Comparator.naturalOrder()); //降順に並んでいるので昇順にソートする

		int[] l = new int[templ.size()];
		int[] r = new int[tempr.size()];

		for (int i = 0; i < templ.size(); i++) {
			l[i] = templ.get(i);
		}

		for (int i = 0; i < tempr.size(); i++) {
			r[i] = tempr.get(i);
		}

		int ans = Integer.MAX_VALUE;

		//左側K個をつける
		if (l.length >= K) {
			ans = Math.min(ans, l[K - 1]);
		}

		//左側x個と、右側K-x個をつける
		if (r.length > 0) {
			for (int i = Math.max(1, K - r.length); i <= Math.min(l.length - 1, K); i++) {
				int t = 0;
				t += l[i - 1] * 2;
				t += r[(K - i) - 1];

				ans = Math.min(ans, t);
			}
		}

		//右側x個と、左側K-x個をつける
		if (l.length > 0) {
			for (int i = Math.max(1, K - l.length); i <= Math.min(r.length - 1, K); i++) {
				int t = 0;
				t += r[i - 1] * 2;
				t += l[(K - i) - 1];

				ans = Math.min(ans, t);
			}
		}

		//右側K個をつける
		if (r.length >= K) {
			ans = Math.min(ans, r[K - 1]);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
