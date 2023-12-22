import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//問題入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] array = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		long space = 1L << 62;
		; //暫定的な面積(あとで表示するのでこれはforのブロックの外で宣言)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k1 = 0; k1 < n; k1++) {
					for (int l = 0; l < n; l++) {
						int counter = 0; //長方形に含まれる点の数をカウント
						for (int c = 0; c < n; c++) {
							if (array[c][0] >= array[i][0] && array[c][0] <= array[j][0] && array[c][1] >= array[k1][1]
									&& array[c][1] <= array[l][1]) {
								counter++;
							}
						}
						if (counter >= k) {
							space = Math.min(space,
									1L*(array[j][0] - array[i][0]) * (array[l][1] - array[k1][1]));
						}
					}
				}
			}
		}
		System.out.println(space);
		sc.close();
	}
}
