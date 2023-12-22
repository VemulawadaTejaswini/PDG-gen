import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] T = new int[N+1];
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			sum+= T[i];
		}

		int M = sc.nextInt();
		int[] P = new int[M+1];
		int[] X = new int[M+1];
		for (int i = 1; i <= M;i++) {
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}

		for (int i = 1;i <= M;i++) {
			System.out.println(sum - T[P[i]] + X[i]);
		}
	}
}