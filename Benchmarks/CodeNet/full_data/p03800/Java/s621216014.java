import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		sc.close();

		int[] a = new int[N + 1];
		boolean chk = false;
		int[][] cand = new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
		for (int[] x : cand) {
			a[0] = x[0];
			a[1] = x[1];
			for (int i = 1; i < N; i++) {
				if (s.charAt(i) == 'o') {
					if (a[i] == 0) {
						a[i + 1] = a[i - 1];
					} else {
						a[i + 1] = 1 - a[i - 1];
					}
				} else {
					if (a[i] == 0) {
						a[i + 1] = 1 - a[i - 1];
					} else {
						a[i + 1] = a[i - 1];
					}
				}
			}
			if (a[N] != a[0]) {
				continue;
			} else {
				chk = true;
				break;
			}
		}
		String ans = null;
		if (chk) {
			StringBuffer buf = new StringBuffer();
			char[] t = new char[] { 'S', 'W' };
			for (int i = 0; i < N; i++) {
				buf.append(t[a[i]]);
			}
			ans = buf.toString();
		} else {
			ans = "-1";
		}
		System.out.println(ans);
	}
}
