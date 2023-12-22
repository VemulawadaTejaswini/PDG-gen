

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int a, b, c, d, e, k;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		k = scan.nextInt();

		int distanceA[] = new int[4];
		int distanceB[] = new int[3];
		int distanceC[] = new int[2];
		int distanceD[] = new int[1];

		distanceA[0] = b - a;
		distanceA[1] = c - a;
		distanceA[2] = d - a;
		distanceA[3] = e - a;

		distanceB[0] = c - b;
		distanceB[1] = d - b;
		distanceB[2] = e - b;

		distanceC[0] = d - c;
		distanceC[1] = e - c;

		distanceD[0] = e - d;

		for (int i = 0; i < 4; i++) {
			if (distanceA[i] > k) {
				System.out.println(":(");
				return;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (distanceB[i] > k) {
				System.out.println(":(");
				return;
			}
		}

		for (int i = 0; i < 2; i++) {
			if (distanceC[i] > k) {
				System.out.println(":(");
				return;
			}
		}

		if (distanceD[0] > k) {
			System.out.println(":(");
			return;
		}

		System.out.println("Yay!");

	}

	//***********************以下共通関数************************************************
	/**
	 * 文字列を反転して返す
	 * @param pStr 文字列
	 * @return 反転した文字列
	 */
	public static String myReverse(String pStr) {
		if (pStr.length() < 1) {
			return "";
		}

		StringBuffer sb = new StringBuffer(pStr);
		return sb.reverse().toString();
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
