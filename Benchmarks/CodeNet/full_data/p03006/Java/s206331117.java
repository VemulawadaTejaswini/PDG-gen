import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] oohako = new int[n][2];
		for (int i = 0; i < n; i++) {
			int[] hako = new int[2];
			hako[0] = sc.nextInt();
			hako[1] = sc.nextInt();
			oohako[i] = hako;
		}
		int min = 99;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int p = oohako[i][0] - oohako[j][0];
				int q = oohako[i][1] - oohako[j][1];
				int[][] oohakoSub = new int[n][2];
				oohakoSub = oohako;
				int nakama = 0;
				for (int m = 0; m < n - 1; m++) {
					if (oohakoSub[m][0] != -1) {
						for (int l = m + 1; l < n; l++) {
							if (oohakoSub[l][0] != -1) {
								int amariX = 0;
								if (p == 0) {
									amariX = oohakoSub[m][0] - oohakoSub[l][0];
								} else {
									if ((oohakoSub[m][0] - oohakoSub[l][0] > 0 && p > 0)
											|| (oohakoSub[m][0] - oohakoSub[l][0] < 0 && p < 0)) {
										amariX = (oohakoSub[m][0] - oohakoSub[l][0]) % p;
									} else {
										amariX = -1;
									}

								}

								int amariY = 0;
								if (q == 0) {
									amariY = oohakoSub[m][1] - oohakoSub[l][1];
								} else {
									if ((oohakoSub[m][1] - oohakoSub[l][1] > 0 && q > 0)
											|| (oohakoSub[m][1] - oohakoSub[l][1] < 0 && q < 0)) {
										amariY = (oohakoSub[m][1] - oohakoSub[l][1]) % q;
									} else {
										amariY = -1;
									}

								}
								if (amariX == 0 && amariY == 0) {
									oohakoSub[l] = new int[] { -1, -1 };
									nakama++;
								}
							}

						}
					}
					oohakoSub[m] = new int[] { -1, -1 };

				}
				if (min > n - nakama) {
					min = n - nakama;
				}
			}
		}
		System.out.println(min);

	}
}