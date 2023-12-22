import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];
		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		Arrays.sort(ab, Comparator.comparing(a -> a[0]));
		long a = 0;
		int idx = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 1; i <= m; i++) {
			while (idx < ab.length && ab[idx][0] <= i) {
				pq.add(ab[idx++][1]);
			}
			if (!pq.isEmpty()) a += pq.poll();
		}

		System.out.println(a);
	}
}
