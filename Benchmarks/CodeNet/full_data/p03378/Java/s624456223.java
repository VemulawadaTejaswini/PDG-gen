import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();
		int A[] = new int[M];

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			if (A[i] > X) {
				sum1++;
			} else if (A[i] < X) {
				sum2++;
			}
		}
		sc.close();
		System.out.println(Math.min(sum1, sum2));
	}
}
