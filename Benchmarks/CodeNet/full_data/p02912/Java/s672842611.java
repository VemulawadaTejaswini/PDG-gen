
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
			pq.add(-A[i]);
		}
		while (M > 0) {
			long v = -pq.poll();
			v /= 2;
			--M;
			pq.add(-v);
		}
		long ans = 0;
		while (!pq.isEmpty()) {
			long v = -pq.poll();
			ans += v;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
