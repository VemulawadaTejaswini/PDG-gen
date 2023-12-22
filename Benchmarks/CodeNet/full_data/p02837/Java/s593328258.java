import java.util.*;

public class Main {
	final static int TRUE = 1;
	final static int FALSE = -1;
	final static int UNDICIDE = 0;

	public static boolean countTruth(int s[], int t[]) {
		int n = s.length;
		int tmp[] = new int[n];
		for (int i = 0; i < n; ++i) {
			tmp[i] = s[i];
		}
		for (int i = 0; i < n; ++i) {
			if (tmp[i] != 0) {
				if (tmp[i] != t[i] && t[i] != 0)
					return false;
			} else {
				tmp[i] = t[i];
			}
		}
		for (int i = 0; i < n; ++i)
			s[i] = tmp[i];
		return true;
	}

	public static int solve(int s[][], int n) {
		int ans = 0, max = 0, cnt = 0, cnt2 = 0;
		if (n <= 1)
			return 1;
		for (int i = 0; i < n; ++i) {
			ans = 1;
			cnt = 0;
			cnt2 = 0;
			int tmp[] = new int[n];
			for (int j = 0; j < n; ++j) {
				tmp[j] = s[i][j];
				if(tmp[j] == TRUE)++cnt2;
			}
			for (int j = 0; j < n; ++j) {
				if(j == i)continue;
				if (tmp[j] == TRUE) {
					boolean t = countTruth(tmp, s[j]);
					if (t)
						++ans;
					else
						++cnt;
				} else if (tmp[j] == UNDICIDE) {
					boolean t = countTruth(tmp, s[j]);
					if (t) {
						++ans;
						tmp[j] = TRUE;
					}
				}
			}
			if (cnt == cnt2 && cnt2 != 0)
				ans = 0;
			max = Math.max(max, ans);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[][] = new int[n][n];
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			for (int j = 0; j < a; ++j) {
				int x = sc.nextInt(), y = sc.nextInt();
				if (y == 0)
					y = -1;
				s[i][x - 1] = y;
			}
		}
		int ans = solve(s, n);
		sc.close();
		System.out.println(ans);
	}
}
