import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (max < Math.abs(A[i] - A[j])) {
					max = Math.abs(A[i] - A[j]);
				}
			}
		}
		System.out.println(max);
	}
}
