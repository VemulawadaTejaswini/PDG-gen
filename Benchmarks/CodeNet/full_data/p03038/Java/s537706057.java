import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());

			for (int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}
			for (int i = 0; i < m; i++) {
				int b = sc.nextInt();
				int c = sc.nextInt();
				for (int j = 0; j < b; j++) {
					a.add(c);
				}
			}
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a.poll();
			}
			System.out.println(sum);
		}
	}
}