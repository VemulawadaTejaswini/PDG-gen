import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] c = new int[N+1];

		for (int i = 0; i < M; i++) {
			c[sc.nextInt()]++;
			c[sc.nextInt()]++;
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(c[i]);
		}

		sc.close();
	}
}
