import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			L[i] = sc.nextInt();
		}

		sc.close();

		// (left, right) にして、sortする
		List<int[]> l = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			l.add(new int[] { X[i] - L[i] + 1, X[i] + L[i] - 1 });
		}
		Comparator<int[]> cmp = (a, b) -> Integer.compare(a[0], b[1]);
		cmp = cmp.thenComparing((a, b) -> Integer.compare(a[1], b[1]));
		l.sort(cmp);

		// 内包しているような関係のものは、外側を取り除く
		boolean[] b = new boolean[l.size()];
		Arrays.fill(b, true);

		for (int i = 0; i < l.size(); i++) {
			if (!b[i]) {
				continue;
			}
			int left = l.get(i)[0];
			int right = l.get(i)[1];
			for (int j = i + 1; j < l.size(); j++) {
				if (right < l.get(j)[0]) {
					break;
				}
				if (left <= l.get(j)[0] && right >= l.get(j)[1]) {
					b[i] = false;
					break;
				}
			}
		}

		List<int[]> l2 = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (b[i]) {
				l2.add(l.get(i));
			}
		}
		l = l2;
		b = new boolean[l.size()];
		Arrays.fill(b, true);

		// のこりを先頭から順にみていき、重なっていたら、rightが大きいほうを取り除く
		for (int i = 0; i < l.size(); i++) {
			if (!b[i]) {
				continue;
			}
			int left = l.get(i)[0];
			int right = l.get(i)[1];
			for (int j = i + 1; j < l.size(); j++) {
				if (right < l.get(j)[0]) {
					break;
				}
				b[j] = false;
			}
		}

		int ans = 0;
		for (boolean x : b) {
			if (x) {
				ans++;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
