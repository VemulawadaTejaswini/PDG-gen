import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		int numVertices = Integer.parseInt(line[0]);
		int numEdges = Integer.parseInt(line[1]);

		Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numEdges; i++) {
            line = scanner.nextLine().split(" ");
            
            int from = Integer.parseInt(line[0]);
            int to = Integer.parseInt(line[1]);

            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
        }

        int[] dp = new int[numVertices + 1];
        boolean[] visited = new boolean[numVertices + 1];

        for(int i = 1; i <= numVertices; i++) {
        	if(!visited[i]) {
        		dfs(graph, i, dp, visited);
        	}
        }

        int result = 0;
        for(int num : dp) {
        	result = Math.max(result, num);
        }

        System.out.println(result);
	}

	private static void dfs(Map<Integer, List<Integer>> graph, int vertex, int[] dp, boolean[] visited) {
		visited[vertex] = true;
		if(graph.containsKey(vertex)) {
			for(int child : graph.get(vertex)) {
				if(!visited[child]) {
					dfs(graph, child, dp, visited);	
				}
				
				dp[vertex] = Math.max(dp[vertex], 1 + dp[child]);
			}
		}
	}
}