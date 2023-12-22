import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N + 1];
		for(int i = 1;i <= N - 1;i++) {
			B[i] = sc.nextInt();
		}
		sc.close();

		int[] A = new int[N + 1];
		A[1] = B[1];
		for(int i = 2;i <= N - 1;i++) {
			A[i] = Math.min(B[i], B[i - 1]);
		}
		A[N] = B[N - 1];
		int sum = 0;
		for(int i = 1;i <= N;i++) {
			sum += A[i];
		}
		System.out.println(sum);

	}
}