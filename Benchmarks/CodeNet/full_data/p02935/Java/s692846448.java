import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Queue<Double> q = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			q.add(sc.nextDouble());
		}
		while (q.size() > 1) {
			q.add((q.poll() + q.poll()) / 2);
		}

		System.out.println(q.poll());
	}
}