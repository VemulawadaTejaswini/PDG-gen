import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] b = new long[k + 1];

		//		int blue = k;
		//		int red = n - k;

		b[1] = 1;
		for (int i = 2; i <= k; i++) {

			b[i] = div(kaijou(k - 1), mul(kaijou(k - i), kaijou(i - 1)));

		}
//		System.out.println(div(n,k));
		for (int i = 1; i <= k; i++) {
			if (2 * k >= n) {
				if (i > n + 1 - k) {
					System.out.println("0");
					continue;
				}
			}

			long combi = div(kaijou(n - k + 1), mul(kaijou(n - k + 1 - i), kaijou(i)));

			long ans = mul(combi, b[i]);
//			System.out.println(kaijou(n - k + 1) + "," + kaijou(n - k + 1 - i) + "," + kaijou(i));
//			System.out.println(b[i] + "," + combi + "," + ans);
			System.out.println(ans);
		}

		sc.close();
	}

	public static long kaijou(int base) {

		long ksum = 1;
		for (int i = 1; i <= base; i++) {
			ksum *= i;
			ksum %= MOD;
		}
		return ksum;
	}

	public static long pow (long x, long y) {
		if (y==0) {
			return 1;
		} else if (y%2==0) {
			long tmp = pow(x,y/2);
			return (tmp*tmp%MOD);
		} else {
			long tmp = pow(x,y/2);
			return (tmp*tmp%MOD)*x%MOD;
		}
	}

	public static long div(long a, long b) {

		return mul(a, pow(b, MOD - 2));
	}

	public static long mul(long a, long b) {

		return ((a % MOD) * (b % MOD)) % MOD;
	}

}