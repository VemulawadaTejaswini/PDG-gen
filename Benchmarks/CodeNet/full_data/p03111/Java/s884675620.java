import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	// 値を取得
	static int n = sc.nextInt();
	static int A = sc.nextInt();
	static int B = sc.nextInt();
	static int C = sc.nextInt();
	static int[] l = new int[n];

	public static int calc(final int i, final int a, final int b, final int c, final int cal) {
		if (i == n) {
			if (a == 0 || b == 0 || c == 0) {
				return Integer.MAX_VALUE;
			}
			return cal + Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c);
		}
		int res = calc(i + 1, a, b, c, cal);
		res = Math.min(res, calc(i + 1, a + l[i], b, c, cal + (a == 0 ? 0 : 10)));
		res = Math.min(res, calc(i + 1, a, b + l[i], c, cal + (b == 0 ? 0 : 10)));
		res = Math.min(res, calc(i + 1, a, b, c + l[i], cal + (c == 0 ? 0 : 10)));

		return res;
	}

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		System.out.println(calc(0, 0, 0, 0, 0));

		sc.close();
	}
}
