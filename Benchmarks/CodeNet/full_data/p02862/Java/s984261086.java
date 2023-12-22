import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		long a = 0;

		if(x > 2*y || y > 2*x) {
			a = 0;
		}else if ((x + y)%3 != 0) {
			a = 0;
		}else {
			int n = (x+y)/3;
			int dif = Math.abs(x-y);
			int r = (n - dif)/2;

			int m = (int) (Math.pow(10, 9) + 7);

			long[] fact = new long[n+1];
			long[] inv =  new long[n+1];
			fact[1] = 1;
			inv[1] = 1;
			for(int i = 2; i < n+1; i++) {
				fact[i] = (fact[i-1] * i) % m;
				inv[i] = (long) (powMod(fact[i], m-2, m) % m);

			}

			a = fact[n]*inv[n-r]%m * inv[r] % m;
		}

		System.out.println(a);

	}


	/**
	 *
	 * @param a 底
	 * @param b 指数
	 * @param m 法
	 * @return
	 */
	public static long powMod(long a, long b, long m) {
		long pow = 1;

		while (b > 0) {
			if((b & 1) == 1) {
				pow *= a%m;
				pow %= m;
			}
			a *= a%m;
			a %= m;
			b >>= 1;
		}

		return pow;
	}

}
