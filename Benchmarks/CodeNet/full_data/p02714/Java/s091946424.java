import java.util.*;

public class Main {

	public static int changeTable(char a) {
		switch (a) {
			case 'R':
				return 0;
			case 'G':
				return 1;
			case 'B':
				return 2;
		}
		return -1;
	}

	public static char changeTable(int a) {
		switch (a) {
			case 0:
				return 'R';
			case 1:
				return 'G';
			case 2:
				return 'B';
		}
		return '\0';
	}

	public static int restrgb(int t, int s) {
		int tmp = s + t;
		switch (tmp) {
			case 1:
				return 2;
			case 2:
				return 1;
			case 3:
				return 0;
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		long ans = 0;
		// index[rgb][i]: rgbそれぞれについてインデックス番号i以上での個数
		int index[][] = new int[3][n + 1];
		for (int i = n - 1; i >= 0; --i) {
			int rgb = changeTable(s.charAt(i));
			for (int j = 0; j < 3; ++j) {
				index[j][i] = index[j][i + 1];
			}
			index[rgb][i]++;
		}
		for (int i = 0; i < n; ++i) {
			char ti = s.charAt(i);
			int rgbi = changeTable(ti);
			for (int j = i + 1; j < n; ++j) {
				char tj = s.charAt(j);
				int rgbj = changeTable(tj);
				if (ti == tj)
					continue;
				int k = restrgb(rgbi, rgbj);
				char rest = changeTable(k);
				int tmp = 2 * j - i;
				if (tmp < n) {
					if (s.charAt(tmp) == rest)
						ans--;
				}
				ans += (long) index[k][j + 1];
			}
		}
		System.out.println(ans);
	}
}
