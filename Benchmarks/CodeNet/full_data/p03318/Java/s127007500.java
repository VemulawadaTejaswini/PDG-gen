import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k = sc.nextInt();

		for (long i = 1; i < k + 1; i++) {
			long sn = getSunuke(i);
			System.out.println(sn);
		}
	}

	private static long getSunuke(long m) {
		long ans = 0;
//		while (m > 0) {
//			ans += (m % 10);
//			m /= 10;
//		}
		if(m >= 10) {
			ans = 10 * (m - 9) + 9;
		}else {
			ans = m;
		}

		return ans;
	}

}
