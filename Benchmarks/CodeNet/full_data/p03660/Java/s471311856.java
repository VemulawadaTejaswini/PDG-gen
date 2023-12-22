import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Path>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(new Path(a, b));
			graph[b].add(new Path(b, a));
		}
		int[] arr = new int[n + 1];
		ArrayDeque<Path> deq = new ArrayDeque<>();
		deq.add(new Path(0, 1));
		while (deq.size() > 0) {
			Path p = deq.poll();
			if (arr[p.to] != 0) {
				continue;
			}
			arr[p.to] = arr[p.from] + 1;
			deq.addAll(graph[p.to]);
		}
		int min = (arr[n] + 1) / 2 + 1;
		deq.add(new Path(n, n));
		int count = 0;
		while (deq.size() > 0) {
			Path p = deq.poll();
			if (arr[p.to] < min) {
				continue;
			}
			arr[p.to] = 0;
			count++;
			deq.addAll(graph[p.to]);
		}
		if (count > n / 2) {
			System.out.println("Snuke");
		} else {
			System.out.println("Fennec");
		}
	}
	
	static class Path {
		int from;
		int to;
		public Path(int from, int to) {
			this.from = from;
			this.to = to;
		}
	}
}
