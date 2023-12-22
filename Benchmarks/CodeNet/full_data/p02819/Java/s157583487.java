import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int X = sc.nextInt();

		// 結果の出力
		while (!isPrime(X)) {
			X++;
		}
		System.out.println(X);

		sc.close();
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (num % i == 0) {
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
	}
}
