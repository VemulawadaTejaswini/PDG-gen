import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		Long[] lifes = new Long[N];
		for (int i=0; i < N; i++) {
			lifes[i] = scan.nextLong();
		}
		Arrays.sort(lifes, Collections.reverseOrder());

		for (int i=0; i < K; i++) {
			if (i >= N) break;
			lifes[i] = Long.valueOf(0);
		}
		long ans = 0;
		for (long i : lifes) {
			ans += i;
		}
		System.out.println(ans);
	}
}