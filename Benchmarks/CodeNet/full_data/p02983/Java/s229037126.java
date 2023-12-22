
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		long N = R;
		if (R - L > 2018) {
			N = L + 2018;
		}
		int ans = 2018;
		for (long i = L; i <= N; i++) {
			for (long j = L + 1; j <= N; j++) {
				long tmp = (i * j) % 2019;
				if (tmp < ans) {
					ans = (int) tmp;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}