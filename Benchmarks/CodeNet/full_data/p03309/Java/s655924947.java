import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			X[i] = A[i] - (i + 1);
		}

		int mid = X[N / 2];

		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Math.abs(X[i] - mid);
		}

		System.out.println(sum);
	}
}