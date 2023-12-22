import java.util.*;
import java.io.*;

class Main {

	private static void updateDistances(List<Integer> []adjList, int []distances, int src) {
		Queue<Integer> que = new LinkedList<>();

		que.add(src);

		if (distances[src] == Integer.MIN_VALUE)
			distances[src] = 0;

		while(!que.isEmpty()) {
			int qSize = que.size();

			for(int i=0; i < qSize; ++i) {
				int node = que.poll();

				for(int target: adjList[node])
					if (distances[target] < 1 + distances[node]) {
						distances[target] = 1 + distances[node];
						que.add(target);
					}
				
			}
		}
	}

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String []s = br.readLine().split(" ");

		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);

		List<Integer> []adjList = new ArrayList[N];

		for(int i=0; i < N; ++i)
			adjList[i] = new ArrayList<>();


		boolean []inValidStartPoint = new boolean[N];

		int []distances = new int[N];
		Arrays.fill(distances, Integer.MIN_VALUE);

		for(int i=0; i < M; ++i) {
			s = br.readLine().split(" ");

			int u = Integer.parseInt(s[0]) - 1;
			int v = Integer.parseInt(s[1]) - 1;

			adjList[u].add(v);
			inValidStartPoint[v] = true;
		}

		for(int i=0; i < N; ++i)
			if (!inValidStartPoint[i])
				updateDistances(adjList, distances, i);

		int result = 0;
		for(int i=0; i < N; ++i)
			result = Math.max(result, distances[i]);

		System.out.println(result);
    }
}