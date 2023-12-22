import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i];
		}

		for (int i = 0; i < N; i ++) {
			A = Arrays.copyOf(B, B.length);
			A[i] = 0;
			Arrays.sort(A);
			System.out.println(A[N - 1]);
		}
	}
}
