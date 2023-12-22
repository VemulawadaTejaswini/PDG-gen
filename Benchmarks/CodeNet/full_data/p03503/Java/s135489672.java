package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int result = 0;
		int[][] f = new int[n][10];
		int[][] p = new int[n][11];
		int[] eikyoudays = new int[n]; // 店ごとの営業日数
		int[] profit = new int[n];
		int[] maxpdays = new int[n]; // 店ごとの利益最大化の営業日数
		int sumMaxdays = 0;
		int hoseip = -10000000;
		int hoseii = 0;

		for (int i = 0; i < n; i++) {
			// 店ごとの営業日数を統計する。
			eikyoudays[i] = 0;
			for (int j = 0; j < 10; j++) {
				f[i][j] = sc.nextInt();
				eikyoudays[i] = eikyoudays[i] + f[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			profit[i] = -10000000;
			for (int j = 0; j < 11; j++) {
				p[i][j] = sc.nextInt();
				if (j <= eikyoudays[i]) {
					if (p[i][j] >= profit[i]) {
						profit[i] = p[i][j];
						maxpdays[i] = j;
					}
				}
			}
			sumMaxdays = sumMaxdays + maxpdays[i];
		}

		for (int i = 0; i < n; i++) {
			result = result + profit[i];
		}
		if (sumMaxdays > 0) {

		} else {

			for (int i = 0; i < n; i++) {
				for (int j = 1; j < 11; j++) {
					if (j <= eikyoudays[i]) {
						if (p[i][j] > hoseip) {
							hoseip = p[i][j];
							hoseii = i;
						}
					}
				}				
			}
			result=result+hoseip-p[hoseii][0];
		}

		System.out.println(result);
	}
}