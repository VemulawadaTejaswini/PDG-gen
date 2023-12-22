import java.util.*;

public class Main {

	static Set<Long> divideSet = new TreeSet<Long>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();

		// 最大公約数を求める
		long gcd = GCD(A, B);
		calcDivide(gcd);

		System.out.println(divideSet.size());
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
		divideSet.add(1l);

		for (long i = 2; i < Math.sqrt(num); i++) {
			while (num % i == 0) {
				divideSet.add(i);
				num /= i;
			}
		}
		if (num != 1) {
			divideSet.add(num);
		}
	}
}
