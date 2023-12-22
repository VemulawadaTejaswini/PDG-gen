import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		Queue<Integer> price = new PriorityQueue<Integer>(Collections.reverseOrder());
		long sum = 0;

		for (int i = 0; i < n; i++) {
			price.add(Integer.parseInt(sc.next()));
		}

		for (int i = 0; i < m; i++) {
			price.add(price.poll() / 2);
		}

		for (int num : price) {
			sum += num;
		}
		System.out.println(sum);

	}
}