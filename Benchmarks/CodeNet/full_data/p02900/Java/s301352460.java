import java.util.*;

public class Main {

	static Set<Integer> divideSet = new TreeSet<Integer>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();

		// 最大公約数を求める
		long gcd = GCD(A, B);

		if (checkPrime(gcd)) {
			System.out.println(1);
		} else {
			calcDivide(gcd);
			System.out.println(divideSet.size());
		}

	}

	// 最大公約数を求める
	public static long GCD(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}

	// 約数を求める
	public static void calcDivide(long num) {
		// 初期化
		divideSet.add(1);

		int d = 2;
		while(num % d == 0) {
			divideSet.add(d);
			num /= 2;
		}

		d++;
		while (num != 1) {
			if (num % d == 0) {
				divideSet.add(d);
				num /= d;
			} else {
				d += 2;
			}
		}
	}

	// 素数チェック
	public static boolean checkPrime(long num) {
		if (num <= 2) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
