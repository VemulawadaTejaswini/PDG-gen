import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long lcm = sc.nextLong();
		for (int i = 0; i < n - 1; i++) {
			long t = sc.nextLong();
			lcm = getLcm(lcm, t);
		}
		System.out.println(lcm);
		sc.close();
	}

	// 2数の最大公約数を求める
	static long getGcd(long a, long b) {
		long rem = a % b;
		if (rem == 0) {
			return b;
		}
		return getGcd(b, rem);
	}

	// 2数の最小公倍数を求める
	static long getLcm(long a, long b) {
		return a / getGcd(a, b) * b;
	}

}
