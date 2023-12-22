import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int card[] = new int[n];

		for (int i = 0; i < n; i++) {
			card[i] = scan.nextInt();
		}

		int alice = 0;
		int bob = 0;

		int temp = 0;
		int kaisu = 0;
		int num = -1;

		for (int j = 0; j < n; j++) {

			// 最大値を求める箇所
			for (int i = 0; i < n; i++) {
				if (temp < card[i]) {
					temp = card[i];
					num = i;
				}
			}

			// 得点を計算する箇所
			if (j % 2 == 0) {
				alice = alice + temp;
			} else {
				bob = bob + temp;
			}
			card[num] = -1;

			// 初期化
			temp = 0;
			num = -1;
		}
		System.out.println(alice - bob);

	}
}