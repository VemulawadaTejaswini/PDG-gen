

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		long h, w;
		h = scan.nextLong();
		w = scan.nextLong();

		long firstRowCount;//はじめの行で行ける数

		long ans;

		if (w == 1) {
			System.out.println(1);
			return;
		}

		//一行で行ける数
		//偶数は半分、奇数は半分+1
		if (w % 2 == 0) {//偶数の時
			firstRowCount = w / 2;
		} else {
			firstRowCount = w / 2 + 1;
		}

		if (h == 1) {
			System.out.println(firstRowCount);
			return;
		}

		ans = firstRowCount;

		//二行目以降で行ける範囲は列数-一行目で行ける数
		for (int i = 2; i <= h; i++) {
			if (i % 2 == 0) {
				ans += w - firstRowCount;
			} else {
				ans += firstRowCount;
			}

		}

		System.out.println(ans);
	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。
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
	 * @param kisu 基数
	 * @param josu 乗数
	 * @param primeNumMod_0 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myPowWithMod(long kisu, long josu, long primeNumMod_0) {

		long ans = 1;

		//乗数が0の場合→1
		if (josu == 0)
			return 1;

		if (primeNumMod_0 == 0) {
			//modを使わないとき

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= kisu;
					josu = josu / 2;
				} else {
					//累乗が奇数の時
					ans *= kisu;
					josu--;
				}
			}

			return ans;

		} else {
			//modを使うとき

			//初めに桁を落とす
			kisu = myMod(kisu, primeNumMod_0);

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= myMod(kisu, primeNumMod_0);
					josu = josu / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(kisu, primeNumMod_0);
					josu--;

				}
			}

			return myMod(ans, primeNumMod_0);

		}

	}

}
