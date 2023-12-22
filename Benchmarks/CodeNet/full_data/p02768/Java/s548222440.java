

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

			sum += (bunshi % MOD) * myModPow(bunbo, MOD - 2, MOD);

		}

		System.out.println(sum % MOD);

	}

	/**
	 * @param a 基数
	 * @param n 乗数
	 * @param primeNumMod 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myModPow(long a, long n, long primeNumMod) {

		long ans = 1;

		//乗数が0の場合→1
		if (n == 0)
			return 1;

		if (primeNumMod == 0) {
			//modを使わないとき

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= a;
					n = n / 2;
				} else {
					//累乗が奇数の時
					ans *= a;
					n--;
				}
			}

		} else {
			//modを使うとき

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= a % primeNumMod;
					n = n / 2;
				} else {
					//累乗が奇数の時
					ans *= a % primeNumMod;
					n--;
				}
			}
		}

		return ans;

	}

}
