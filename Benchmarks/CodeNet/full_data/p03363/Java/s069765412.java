
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
		int[] A = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			System.out.println(A[i]);
		}
		for (int i = 0; i < N - 1; i++) {
			int sum = A[i];
			for (int j = i + 1; j < N; j++) {
				sum += A[j];
				if (sum == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}