import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 1; i <= n; i++)
            graph.put(i, new ArrayList<>());

        for(int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n+1];
        visited[1] = true;

        int step = 1;
        int[] steps = new int[n + 1];
        steps[step]++;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while(!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int node = queue.poll();
                for(int adj : graph.get(node)) {
                    if(visited[adj]) continue;
                    steps[step]++;
                    queue.offer(adj);
                    visited[adj] = true;
                }
            }
        }
        int ways = 1;
        for(int s : steps) {
            if(s == 0) continue;
            ways *= s;
        }
        System.out.println(ways);
    }

}