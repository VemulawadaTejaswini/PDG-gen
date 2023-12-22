import java.util.*;

public class Main {
    private final static int M = 1000000007;

    private static int solve(int N, int[][] edges) {
        List<Integer>[] adj = new List[N];
        int[] degree = new int[N];

        for (int i = 0; i < N; i++) adj[i] = new ArrayList<>();
        for (int[] edge: edges) {
            adj[edge[0]-1].add(edge[1]-1);
            adj[edge[1]-1].add(edge[0]-1);
            degree[edge[0]-1] += 1;
            degree[edge[1]-1] += 1;
        }

        int[] white = new int[N];
        int[] black = new int[N];
        Arrays.fill(white, 1);
        Arrays.fill(black, 1);
        
        boolean[] done = new boolean[N];
        boolean[] added = new boolean[N];
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++)
            if (degree[i] < 2) {
                q.add(i);
            }

        int max = -1;
        while (!q.isEmpty()) {
            int node = q.poll();

            for (int next: adj[node]) {
                if (done[next]){
                  white[node] = (white[node] * (white[next] + black[next])) % M;
                  black[node] = (black[node] * white[next]) % M;
                } else {
                  degree[next] -= 1;

                  if (degree[next] < 2 && !added[next]) {
                    q.add(next);
                    added[next] = true;
                  }
                }
            }
            done[node] = true;
            max = Math.max(max, (white[node] + black[node]) % M);
        }
      
        return max;
    }

    public static int run(Scanner scanner) {
        int N = scanner.nextInt();
        int[][] edges = new int[N-1][2];
        for (int i=0; i < N-1; i++)
            edges[i] = new int[] { scanner.nextInt(), scanner.nextInt() };

        return solve(N, edges);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}