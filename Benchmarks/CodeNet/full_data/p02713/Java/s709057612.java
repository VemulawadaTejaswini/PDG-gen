import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long sum = 0;
		for (int a = 1; a <= k; ++a) {
			for (int b = 1; b <= k; ++b) {
				long g1 = findGcd(a, b);
				for (int c = 1; c <= k; ++c) {
					long g2 = findGcd(g1, c);
					sum += g2;
				}
			}
		}

		System.out.println(sum);
	}

	public static long findGcd(long a, long b) {
		if (b == 0L) {
			return a;
		}
		return findGcd(b, a % b);
	}

}
