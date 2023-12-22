import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] A = new long[(int) N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		long[] Match = new long[(int) N];
		if (N % 2 == 0) {
			int index = 0;
			for (long i = 1; i < N; i += 2) {
				Match[index] = i;
				index++;
				Match[index] = i;
				index++;
			}
		} else {
			int index = 1;
			Match[0] = 0;
			for (long i = 2; i < N; i += 2) {
				Match[index] = i;
				index++;
				Match[index] = i;
				index++;
			}
		}
		for (int i = 0; i < N; i++) {
			if (A[i] != Match[i]) {
				System.out.println(0);
				return;
			}
		}

		long ret = 1;
		for (int i = 0; i < N / 2; i++) {
			ret *= 2;
		}
		while (ret >= 1000000007) {
			ret -= 1000000007;
		}
		System.out.println(ret);

	}
}