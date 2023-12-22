import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			int nebiki = q.poll() / 2;
			q.add(nebiki);
		}
		System.out.println(q.stream().mapToLong(Long::valueOf).sum());
		sc.close();
	}
}
