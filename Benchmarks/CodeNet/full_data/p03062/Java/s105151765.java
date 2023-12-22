import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] A = new long[N];
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
			}
			long ans = 0;
			for (int i = 0; i < N; i++) {
				if (i != N - 1) {
					if (A[i] < 0) {
						A[i] = A[i] * (-1);
						A[i + 1] = A[i + 1] * (-1);
					}
				}
				ans += A[i];
			}
			System.out.println(ans);
		}
	}
}