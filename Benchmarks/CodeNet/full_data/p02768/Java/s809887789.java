import java.util.Scanner;

public class Main {

	static long mod = (long) Math.pow(10, 9) + 7;

	public static void main(String[] args) {

		long n = 0;
		long a = 0;
		long b = 0;
		long anser = 0;

		Scanner scan = new Scanner(System.in);

		n = scan.nextLong();
		a = scan.nextLong();
		b = scan.nextLong();

		//
		long c = (long) (powB(2, n) - 1) % mod;

		long bunsiA = conbination(n, a);
		long bunboA = factorial(a);
		long bunsiB = conbination(n, b);
		long bunboB = factorial(b);

		//分母をmod-2乗する
		bunboA = powAlfa(bunboA);
		bunboB = powAlfa(bunboB);

		//かけ合わせる
		long nca = (bunsiA * bunboA) % mod;
		long ncb = (bunsiB * bunboB) % mod;

		anser = (c - nca - ncb) % mod;

		if (anser < 0) {
			anser += mod;
		}

		System.out.println(anser);

	}

	private static long factorial(long n) {
		long fact = 1;
		for (long i = 1; i <= n; i++) {
			fact = fact * i % mod;
		}
		return fact;
	}

	//conbination(leftNum,rightNum)の分子の計算
	private static long conbination(long leftNum, long rightNum) {
		long pai = 1;

		for (long i = leftNum; i > leftNum - rightNum; i--) {
			pai = pai * i % mod;
		}
		return pai;

	}

	//mod-2乗の計算
	private static long powAlfa(long number) {
		long anser = 1;
		long n = mod - 2;
		while (n > 0) {
			if ((n & 1) == 1) {
				anser = anser * number % mod;
			}
			number = number * number % mod;
			n >>= 1;
		}
		return anser;
	}

	private static long powB(long number, long sisuu) {
		long anser = 1;
		while (sisuu > 0) {
			if ((sisuu & 1) == 1) {
				anser = anser * number % mod;
			}
			number = number * number % mod;
			sisuu >>= 1;
		}
		return anser;
	}

}
