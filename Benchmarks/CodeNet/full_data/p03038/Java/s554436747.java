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
		long sum = 0;

		// 宣言
		Queue<Long> q = new PriorityQueue<Long>();
		Queue<Long> qq = new PriorityQueue<Long>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			q.add(A[i]);
		}
		for (int j = 0; j < M; j++) {
			B[j] = sc.nextInt();
			C[j] = sc.nextLong();
			for (int k = 0; k < B[j]; k++) {
				qq.add(C[j]);
			}
		}
		for (int i = 0; i < N; i++) {
			if (!qq.isEmpty()) {
				sum += Math.max(q.poll(), qq.poll());
			} else {
				sum += q.poll();
			}
		}

		sc.close();
		System.out.println(sum);
	}
};
