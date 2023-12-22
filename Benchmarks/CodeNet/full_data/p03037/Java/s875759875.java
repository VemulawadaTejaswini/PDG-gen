import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		// IDカード枚数の枚数
		int N = sc.nextInt();

		// 全ゲート通過できないIDカードの枚数
		int count = 0;

		// ゲートの個数
		int M = sc.nextInt();

		// ゲート通過できるカードの条件
		int L[] = new int[M];
		int R[] = new int[M];

		for (int j = 0; j < M; j++) {
			L[j] = sc.nextInt();
			R[j] = sc.nextInt();
		}

		// i=i番目のカード
		for (int i = 1; i <= N; i++) {

			// 全てのゲートを通過できるか確認
			for (int j = 0; j < M; j++) {
				if (L[j] <= i && i <= R[j]) {
				} else {
					// 通過できない場合
					count++;
					break;
				}
			}
		}

		System.out.print(N - count);
	}
}
