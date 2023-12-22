import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];

		for(int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(X);
		if(N >= M) {
			System.out.println(0);
			System.exit(0);
		}
		long[] e = new long[M - 1];
		for(int i = 0; i < M - 1; i++) {
			e[i] = Math.abs(X[i + 1] - X[i]);
		}
		Arrays.sort(e);
		long sum = 0;
		for(int i = 0; i < M - N; i++) {
			sum += e[i];
		}
		System.out.println(sum);

	}
}