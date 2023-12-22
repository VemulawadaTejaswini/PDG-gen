import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[] array = new boolean[999999];
		for (int i = 1; i < array.length; i++) {
			if (isPrime(i + 1)) {
				array[i] = true;
			}
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			int count = 0;
			for (int j = l; j <= r; j++) {
				if (array[j - 1] == true && array[(j + 1) / 2 - 1] == true) {
					count++;
				}
			}
			System.out.println(count);
		}
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