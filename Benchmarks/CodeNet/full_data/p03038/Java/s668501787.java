import java.util.*;

public class Main {
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    for (int j = 0; j < b; j++) {
		        queue.add(Math.max(c, queue.poll()));
		    }
		}
		long total = 0;
		while (queue.size() > 0) {
		    total += queue.poll();
		}
		System.out.println(total);
	}
}
