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

		long nNokaijou = factorial(n) % mod;
		long aNokaijou = factorial(a) % mod;
		long nMainasuAnokajou = factorial(n - a) % mod;
		long bNokaijou = factorial(b) % mod;
		long nMainasuBnokaijou = factorial(n - b) % mod;

		//mod-2乗して剰余を求める
		aNokaijou = powAlfa(aNokaijou);
		bNokaijou = powAlfa(bNokaijou);
		nMainasuAnokajou = powAlfa(nMainasuAnokajou);
		nMainasuBnokaijou = powAlfa(nMainasuBnokaijou);
		//かけ合わせる
		long nca = (nNokaijou * nMainasuAnokajou * aNokaijou) % mod;
		long ncb = (nNokaijou * nMainasuBnokaijou * bNokaijou) % mod;
		//引く
		anser = (c - nca - ncb) % mod;

		System.out.println(anser);

	}

	private static long factorial(long n) {
		long fact = 1;
		for (long i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
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

	private static long powB(long number,long n) {
		long anser = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				anser = anser * number % mod;
			}
			number = number * number % mod;
			n >>= 1;
		}
		return anser;
	}

}
