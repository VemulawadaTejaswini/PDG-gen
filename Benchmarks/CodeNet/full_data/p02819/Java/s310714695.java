import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		while (!isPrime(X)) {
			X++;
		}
		System.out.println(X);
		sc.close();
	}

	//素数判定
	//計算量O(√N)
	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}