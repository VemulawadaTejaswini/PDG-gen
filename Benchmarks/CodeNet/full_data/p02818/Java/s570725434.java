import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// A, B, Kを取得
		Scanner scan = new Scanner(System.in);
		String aStr = scan.next();
		String bStr = scan.next();
		String kStr = scan.next();
		scan.close();

		// a, b, kを数値に変換
		long a = Long.parseLong(aStr);
		long b = Long.parseLong(bStr);
		long k = Long.parseLong(kStr);

		long resA = 0;
		long resB = 0;

		// kが二人のクッキー合計以上の場合
		if (k >= a + b) {
			resA = 0;
			resB = 0;

			// kが二人のクッキー合計より小さい場合
		} else {

			// 高橋君がクッキーをk枚以下持っている場合
			if (a <= k) {
				resA = 0;
				resB = b - (k - a);

				// 高橋君がクッキーをk枚より多く持っている場合
			} else {
				resA = a - k;
				resB = b;
			}
		}

		// 高橋君と青木君が最終的に持っているクッキーの枚数を出力
		System.out.println(resA + " " + resB);

	}

}
