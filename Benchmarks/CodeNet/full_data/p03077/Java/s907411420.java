import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Long N = sc.nextLong();
		Long min = 1000000000000000L;
		int norimono = 0;
		long ans = 0;

		for (int i = 0; i < 5; i++) {
			long X = sc.nextInt();
			if (min > X) {
				norimono = i + 1;
				min = X;
			}
		}
		sc.close();

		if (N % min == 0) {
			ans = N / min + 4;
		} else {
			ans = N / min + 1 + 4;
		}

		System.out.println(ans);
	}
};
