import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		int ans = 0;
		int N = sc.nextInt();
		int[] listA = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			listA[i] = sc.nextInt();
		}
		long Min = -10 ^ 9 * 2 * 10 ^ 5;
		long Max = 10 ^ 9 * 2 * 10 ^ 5;
		long sum = 0;
		for (i = 0; i < N; i++) {
			sum = listA[i];
			int n;
			for (n = i + 1; n < N && sum >= Min && sum <= Max; n++) {
				sum = sum + listA[n];
				if (sum == 0) {
					ans++;

				}
			}
			sum = 0;
		}

		System.out.println(ans);

		sc.close();
	}
}
