import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int[] r = new int[cs.length];
		int[] l = new int[cs.length];
		for (int i = 0; i < cs.length; ++i) {
			if (cs[i] == 'L') {
				l[i] = l[i - 1] + 1;
			}
		}
		for (int i = cs.length - 1; i >= 0; --i) {
			if (cs[i] == 'R') {
				r[i] = r[i + 1] + 1;
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		int[] cnt = new int[cs.length];
		for (int i = 0; i < cs.length; ++i) {
			if (cs[i] == 'R') {
				++cnt[i + r[i] - r[i] % 2];
			} else {
				++cnt[i - l[i] + l[i] % 2];
			}
		}
		for (int i = 0; i < cs.length; ++i) {
			pw.print(cnt[i] + (i == cs.length - 1 ? "\n" : " "));
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}