import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0;i < N;++ i) graph.add(new ArrayList<>());
		for (int i = 0;i < M;++ i) {
			int x = sc.nextInt() - 1, y = sc.nextInt() - 1, z = sc.nextInt();
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		int ans = 0;
		boolean bfs[] = new boolean[N];
		Arrays.fill(bfs, false);
		for (int i = 0;i < N;++ i) {
			if (bfs[i]) continue; // 調べ終わっている
			bfs[i] = true;
			++ ans;
			Queue<Integer> queue = new ArrayDeque<>();
			for (queue.add(i);!queue.isEmpty();) {
				int tmp = queue.poll();
				for (int next : graph.get(tmp)) {
					if (bfs[next]) continue; // 既に色を塗った
					bfs[next] = true;
					queue.add(next);
				}
			}
		}
		System.out.println(ans);
	}
}