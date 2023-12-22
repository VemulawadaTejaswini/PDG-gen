import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Path>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(new Path(b, c));
		}
		long[] values = new long[n + 1];
		Arrays.fill(values, Integer.MIN_VALUE * 1000L);
		ArrayDeque<Order> deq = new ArrayDeque<>();
		deq.add(new Order(new Path(1, 0), 0));
		int count = 0;
		long tmp = 0;
		while (deq.size() > 0) {
			Order o = deq.poll();
			if (values[o.p.to] < o.value + o.p.value) {
				values[o.p.to] = o.value + o.p.value;
				for (Path p : graph[o.p.to]) {
					deq.add(new Order(p, values[o.p.to]));
				}
			}
			if (count == n * 100) {
				tmp = values[n];
			} else if (count == n * 1000) {
				if (tmp < values[n]) {
					System.out.println("inf");
					return;
				}
				break;
			}
			count++;
		}
		System.out.println(values[n]);
	}
	static class Order {
		Path p;
		long value;
		public Order(Path p, long value) {
			this.p = p;
			this.value = value;
		}
	}
	
	static class Path {
		int to;
		int value;
		public Path(int to, int value) {
			this.to = to;
			this.value = value;
		}
	}
}
