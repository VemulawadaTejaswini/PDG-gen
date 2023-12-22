import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		boolean[][] ok = new boolean[4][1000];
		ok[0][0] = true;
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		for (int i = 0; i < N; ++i) {
			int v = (int) (s[i] - '0');
			for (int len = 2; len >= 0; --len) {
				for (int pre = 0; pre < 1000; ++pre) {
					if (pre * 10 + v < 1000)
						ok[len + 1][pre * 10 + v] |= ok[len][pre];
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < ok[3].length; ++i)
			if (ok[3][i])
				++ans;
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
