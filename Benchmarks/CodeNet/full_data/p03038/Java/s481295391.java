import java.util.PriorityQueue;
import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long A[] = new long[N];
		int B[] = new int[M];
		long C[] = new long[M];
		int sum = 0;

		// 宣言
		Queue<Long> q = new PriorityQueue<Long>();

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			q.add(A[i]);
		}
		for (int j = 0; j < M; j++) {
			B[j] = sc.nextInt();
			C[j] = sc.nextLong();
			for (int k = 0; k < B[j]; k++) {
				long x = q.poll();
				if (x < C[j]) {
					q.add(C[j]);
				} else {
					q.add(x);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			sum += q.poll();
		}

		sc.close();
		System.out.println(sum);
	}
};
