import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<ArrayList<Integer>> cost = new ArrayList<>(), to = new ArrayList<>();
			int N = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < N; i++) {
				to.add(new ArrayList<>());
				cost.add(new ArrayList<>());
			}
			for (int i = 0; i < N - 1; i++) {
				String[] line = sc.nextLine().split(" ");
				int u = Integer.parseInt(line[0]) - 1;
				int v = Integer.parseInt(line[1]) - 1;
				int w = Integer.parseInt(line[2]);
				to.get(u).add(v);
				cost.get(u).add(w);
				to.get(v).add(u);
				cost.get(v).add(w);
			}
			int[] ans = new int[N];
			Arrays.fill(ans, -1);
			ans[0] = 0;
			Deque<Integer> q = new ArrayDeque<>();
			q.add(0);
			while (!q.isEmpty()) {
				int v = q.poll();
				for (int i = 0; i < to.get(v).size(); i++) {
					int u = to.get(v).get(i);
					if (ans[u] > -1) continue;
					int w = cost.get(v).get(i);
					ans[u] = (ans[v] + w) % 2;
					q.push(u);
				}
			}
			Arrays.stream(ans).forEach(r -> System.out.println(r));
		}
	}
}