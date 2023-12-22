import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());
		for (int i = 0; i < n; i++) {
			pq.add(sc.nextInt());
		}
		int t, b, c;
		for (int i = 0; i < m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			for (int j = 0; j < b; j++) {
				t = pq.poll();
				if (t < c) {
					pq.add(c);
				} else {
					pq.add(t);
					break;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}