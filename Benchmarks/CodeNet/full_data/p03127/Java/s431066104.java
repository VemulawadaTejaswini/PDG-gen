import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(gcd(a));
	}

	public static final int gcd(int a, int b) {
		// a > b にする（swap）
		if (a < b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}

		// ユークリッドの互除法
		int r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}

		return a; // b には r=0 の値が入るため、a を返す
	}

	/**
	 * <h1>３つ以上の最大公約数を求める[gcd(a, b, c,...)]</h1>
	 * <p>
	 * ユークリッドの互除法の繰り返しで求める。
	 * </p>
	 * 
	 * @param param ： 数値1, 2, 3,... (a, b, c,...) (>0) [引数は3個以上]
	 * @return<b>int</b> ： 最大公約数(なし=1[互いに素])
	 */
	public static final int gcd(final int[] param) {
		final int len = param.length;
		int g = gcd(param[0], param[1]); // gcd(a, b) は以前作ったもの
		for (int i = 1; i < len - 1; i++) {
			g = gcd(g, param[i + 1]); // gcd(a, b) は以前作ったもの
		}
		return g;
	}
}