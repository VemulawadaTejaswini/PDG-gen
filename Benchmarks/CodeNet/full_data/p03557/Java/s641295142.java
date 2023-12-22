import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[N];

		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}

		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long ans=0;

		for (int i = 0; i < N; i++) {
			int bi=b[i];

			int ai=lowerbound(a, bi);
			int ci=upperbound(c, bi);

			ai=Math.max(0,ai);
			ci=Math.min(N,ci);

			ans+=(long)(N-1-ci)*ai;

		}

		System.out.println(ans);
	}

	//以下テンプレート

	int lowerbound(int[] a, int key) {

		int left = -1;
		int right = a.length;

		while (Math.abs(right - left) > 1) {

			int mid = (right + left) / 2;

			if (a[mid] >= key) {
				right = mid;
			} else {
				left = mid;
			}

		}

		return right;

	}

	int upperbound(int[] a, int key) {

		int left = -1;
		int right = a.length;

		while (Math.abs(right - left) > 1) {

			int mid = (right + left) / 2;

			if (a[mid] <= key) {
				left = mid;
			} else {
				right = mid;
			}

		}

		return left;

	}

	public static String numtoalpha(int i) {

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		return alpha.substring(i, i + 1);

	}

	public static int[] extgcd(int a, int b) {

		int x0 = 1;
		int x1 = 0;

		int y0 = 0;
		int y1 = 1;

		while (b != 0) {
			int q = a / b;
			int r = a % b;

			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;

			a = b;
			b = r;

			x0 = x1;
			x1 = x2;

			y0 = y1;
			y1 = y2;
		}

		return new int[] { a, x0, y0 };

	}

	static int gcd(int a, int b) {

		if (b == 0)
			return a;

		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}

		return gcd(b, a % b);

	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	static void swap(int[] a) {
		int t;

		t = a[0];
		a[0] = a[1];
		a[1] = t;

		return;
	}

	static <T> void output(List<T> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));

			if (i != list.size() - 1) {
				System.out.print(" ");
			} else {
				nl();
			}
		}

	}

	static void output(String[][] str) {

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				print(str[i][j]);
			}

			nl();
		}

	}

	static void output(boolean flg, String Yes, String No) {

		if (flg) {
			pln(Yes);
		} else {
			pln(No);
		}

	}

	static void output(String[][] str, int digit) {

		String dig = "%" + String.valueOf(digit) + "s";

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.printf(dig, str[i][j]);
			}
			nl();
		}

	}

	static void pln(String str) {
		System.out.println(str);
	}

	static void pln(int x) {
		System.out.println(x);
	}

	static void print(String str) {
		System.out.print(str);
	}

	static void print(int x) {
		System.out.print(x);
	}

	static void print(String str, int times) {
		for (int i = 0; i < times; i++) {
			print(str);
		}
	}

	static void print(int x, int times) {
		for (int i = 0; i < times; i++) {
			print(x);
		}
	}

	static void nl() {
		System.out.println();
	}

}
