

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n, m;

		n = scan.nextInt();
		m = scan.nextInt();

		if (m == 4 || m == 5) {
			System.out.println(-1);
			return;
		}

		int s[] = new int[m];
		int c[] = new int[m];

		//一度書き込みした桁数を保存する
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < m; i++) {
			boolean update_flg = false;
			int s_tmp;
			int c_tmp;

			s_tmp = scan.nextInt();
			c_tmp = scan.nextInt();

			if (map.containsKey(s_tmp)) {
				update_flg = true;

			}

			if (update_flg) {
				if (map.get(s_tmp) != c_tmp) {
					System.out.println(-1);
					return;
				}
			}
			s[i] = s_tmp;
			c[i] = c_tmp;

			map.put(s_tmp, c_tmp);
		}

		//ans は1桁から持つ
		int ans[] = new int[n + 1];

		for (int k = 0; k < m; k++) {
			//1桁目が0だったらエラー
			if (n != 1) {
				if (s[k] == 1) {
					if (c[k] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}

			ans[s[k]] = c[k];

		}

		if (n != 1) {
			if (ans[1] == 0) {
				ans[1] = 1;
			}
		}

		//文字列として結合
		String ansString = "";

		for (int j = 1; j <= n; j++) {
			ansString += ans[j];
		}

		System.out.println(ansString);

	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。ｓ
	 */
	public static long myMod(long a, long b) {
		long ret = 0;

		ret = a % b;

		if (ret < 0) {
			ret += b;
		}

		return ret;
	}

	/**
	 * 乗数を求める ※mod対応
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

			return ans;

		} else {
			//modを使うとき

			//初めに桁を落とす
			a = myMod(a, primeNumMod);

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= myMod(a, primeNumMod);
					n = n / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(a, primeNumMod);
					n--;

				}
			}

			return myMod(ans, primeNumMod);

		}

	}

}
