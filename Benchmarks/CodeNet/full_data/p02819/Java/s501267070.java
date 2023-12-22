import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// Xを取得
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());

		// X以上の整数を条件を満たすまで調べる
		for (;; x++) {

			// xが素数か調べる
			boolean isPrime = checkPrime(x);

			// 素数である場合、調べ終わる
			if (isPrime) {
				break;
			}

		}

		// 結果を出力
		System.out.println(x);

	}

	private static boolean checkPrime(final int x) {

		// 2から(x-1)までで割り切れるか確認する
		for (int i = 2; i < x; i++) {

			// 割り切れるものがある場合、素数ではない
			if (x % i == 0) {
				return false;
			}
		}

		// 割り切れるものがない場合、素数である
		return true;
	}

}
