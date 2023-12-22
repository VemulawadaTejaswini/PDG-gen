import java.io.*;
import java.util.*;

public class Main {
	public static long solve(int n, int m, Map<Integer, List<Integer>> graph) {
		int[] color = new int[n];
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		color[0] = 1;
		int blackCount = 1;
		int whiteCount = 0;
		while(!q.isEmpty()) {
			int next = q.poll();
			List<Integer> neighbors = graph.get(next);
			for(int neighbor : neighbors) {
				if(color[neighbor] == color[next]) {
					long total = ((long) n) * (n - 1) / 2;
					return total - m;
				} else if(color[neighbor] == 0) {
					int newColor = 3 - color[next];
					color[neighbor] = newColor;
					if(newColor == 1) {
						blackCount++;
					} else {
						whiteCount++;
					}
					q.offer(neighbor);
				}
			}
		}
		long count = 0;
		for(int i = 0; i < n; i++) {
			if(color[i] == 1) {
				count += whiteCount - graph.get(i).size();
			} else {
				count += blackCount - graph.get(i).size();
			}
		}
		return count/2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<Integer, List<Integer>> graph = new HashMap<>();
		for(int i = 0; i < n; i++) {
			graph.put(i, new ArrayList<>());
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(f.readLine());
			int to = Integer.parseInt(st.nextToken()) - 1;
			int from = Integer.parseInt(st.nextToken()) - 1;
			graph.get(to).add(from);
			graph.get(from).add(to);
		}
		long answer = solve(n, m, graph);
		System.out.println(answer);
	}
}
