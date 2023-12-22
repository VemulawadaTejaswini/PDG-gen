import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);

		int sum = 0;
		int day = 1;
		for (int j = 1; j <= m; j++) {
			for (int i = 0; i < n; i++) {
				if (a[i] == day) {
					q.add(b[i]);
				}
			}
			day++;
			sum += (int) q.poll();
		}

		System.out.println(sum);

		sc.close();

	}
}