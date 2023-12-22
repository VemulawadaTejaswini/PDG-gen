import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(A);
		int cnt = 0;
		long cur = A[0];
		for (int i = 1; i < N; i++) {
			if (cur * 2 < A[i]) {
				cnt = i;
			}
			cur += A[i];
		}
		System.out.println(N - cnt);
	}
}
