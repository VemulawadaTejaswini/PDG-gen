import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int cnt = 0;
		for (int i = 1; i < n - 1; i++) {
			if (isBSecond(p[i - 1], p[i], p[i + 1]))
				cnt++;
		}

		System.out.println(cnt);

		sc.close();
	}

	static boolean isBSecond(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return true;
			}
		} else {
			if (c >= b) {
				return true;
			}
		}

		return false;
	}

}
