import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// N
		int n = scn.nextInt();
		// K
		int k = scn.nextInt();
		// outputInt
		int result = 0;

		// aループ
		for (int a = 1; a <= n; a++) {
			// bループ
			for (int b = 1; b <= n; b++) {
				// a+bの判定
				if ((a + b) % k != 0) {
					// a+bがkの倍数でない場合cを判定せず次のbを判定する
					continue;
				}
				// cループ
				for (int c = 1; c <= n; c++) {
					// a+cとb+cの判定
					if ((a + c) % k != 0 || (b + c) % k != 0) {
						// kの倍数ではないばあい次のcを判定する
						continue;
					} else {
						// a+c、b+cがkの倍数の場合結果に加算
						result++;
					}
				}
			}
		}
		
		// 出力
		System.out.println(result);
		scn.close();
	}

}
