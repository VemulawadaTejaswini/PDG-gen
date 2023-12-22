import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		sc.close();

		if (M == 1) {
			System.out.println(N);
			return;
		}

		if (L[M - 1] != R[0]) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}
}
