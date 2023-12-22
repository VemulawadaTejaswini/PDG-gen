import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Node[] arr = new Node[n];
		for (int i = 0; i < n; i++) {
			Node o = new Node();
			o.i = i;
			arr[i] = o;
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			arr[a].nexts.add(b);
			arr[b].nexts.add(a);
		}
		br.close();

		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		arr[0].x = 1;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int next : arr[cur].nexts) {
				if (arr[next].x == 0) {
					que.add(next);
					arr[next].x = 3 - arr[cur].x;
				} else if (arr[next].x == arr[cur].x) {
					System.out.println((long) n * (n - 1) / 2 - m);
					return;
				}
			}
		}

		int[] cnt = new int[3];
		for (Node o : arr) {
			cnt[o.x]++;
		}
		System.out.println((long) cnt[1] * cnt[2] - m);
	}

	static class Node {
		int i, x;
		List<Integer> nexts = new ArrayList<>();
	}
}
