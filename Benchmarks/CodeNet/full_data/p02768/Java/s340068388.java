
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		final long MOD = 1_000_000_007;

		long n, a, b;

		//花の種類
		n = scan.nextLong();

		//苦手な数
		a = scan.nextLong();
		b = scan.nextLong();

		//合計通り
		long sum = 0;

		for (long n_count = 2; n_count <= n; n_count++) {
			if (n_count == a || n_count == b) {
				continue;
			}

			int bunbo;
			int bunshi;
			bunbo = 1;
			bunshi = 1;

			long loop_count = 0;
			while (true) {
				bunshi *= (n - loop_count) % MOD;
				loop_count++;

				if (n_count == loop_count)
					break;
			}

			long loop_count_bunbo = 0;
			while (true) {
				if (n_count - loop_count_bunbo == 1)
					break;

				bunbo *= (n_count - loop_count_bunbo) % MOD;
				loop_count_bunbo++;

			}

			sum += (bunshi % MOD) * myModPow(bunbo, MOD - 2, MOD, 1);

		}

		System.out.println(sum % MOD);
	}

	/**
	 * 余りを計算する。0以上で返す
	 * @param a 割られる数
	 * @param b 割る数
	 * @return 余り0以上の数
	 */
	public static double myMod(double a, double b) {
		double res = a % b;

		if (res < 0) {
			//余りが0以下だったら0以上にして返す
			return res + b;
		} else {
			return res;
		}
	}

	/**
	 * 累乗計算をする
	 * @param a 基数
	 * @param n 乗数
	 * @const_1 呼び出し時は1
	 * @return 計算結果
	 */
	public static long myPow(long a, long n, long const_1) {

		//乗数が0の場合→1
		if (n == 0)
			return 1;

		//乗数が1の場合→基数を返す
		if (n == 1) {
			a *= const_1;
			return a;
		}

		//乗数が奇数か偶数かで処理を分ける
		if (n % 2 == 0) {
			//偶数の時
			return myPow(a * a, n / 2, const_1);
		} else {
			//奇数の時(末尾再帰にする)

			//二分できなかった基数を掛け合わせておく
			const_1 *= a;
			return myPow(a, n - 1, const_1);
		}

	}

	/**
	 * 累乗計算をする(mod p)
	 * @param a 基数
	 * @param n 乗数
	 * @param primeNumMod 法(素数)
	 * @param const_1 1固定(プログラム内で使用)
	 * @return 計算結果
	 */
	public static long myModPow(long a, long n, long primeNumMod, long const_1) {

		//乗数が0の場合→1
		if (n == 0)
			return 1;

		//乗数が1の場合→基数を返す
		if (n == 1) {
			a *= const_1 % primeNumMod;
			return a;
		}

		//乗数が奇数か偶数かで処理を分ける
		if (n % 2 == 0) {
			//偶数の時
			return myPow(a * a % primeNumMod, n / 2, const_1);
		} else {
			//奇数の時(末尾再帰にする)

			//二分できなかった基数を掛け合わせておく
			const_1 *= a;
			return myPow(a, n - 1, const_1);
		}

	}

}
