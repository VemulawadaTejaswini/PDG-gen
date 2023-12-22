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
		int[][] go = new int[10][cs.length];
		for (int src = 0; src < cs.length; ++src) {
			int cur = src;
			for (int i = 0; i < 10; ++i) {
				cur = (cs[cur] == 'R' ? (cur + 1) : (cur - 1));
			}
			go[0][src] = cur;
		}
		for (int i = 0; i + 1 < go.length; ++i) {
			for (int j = 0; j < go[i].length; ++j) {
				go[i + 1][j] = go[i][go[i][j]];
			}
		}
		int[] cnt = new int[cs.length];
		for (int i = 0; i < cs.length; ++i) {
			int cur = i;
			for (int n = 100, j = 0; n > 0; n >>= 1, ++j) {
				if (n % 2 == 1) {
					cur = go[j][cur];
				}
			}
			++cnt[cur];
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < cnt.length; ++i) {
			pw.print(cnt[i] + (i == cnt.length - 1 ? "\n" : " "));
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}