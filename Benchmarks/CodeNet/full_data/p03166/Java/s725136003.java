import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        List<Integer>[] edges = new List[N + 1];
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MIN_VALUE);
        int[] inDegree = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            inDegree[dest]++;
            if (edges[src] == null) {
                edges[src] = new ArrayList<>();
            }
            edges[src].add(dest);
        }
        List<Integer> sort = topologicalSort(edges, inDegree, N);
        dist[sort.get(0)] = 0;
        for (Integer vertex : sort) {
            if (edges[vertex] != null) {
                for (Integer adj: edges[vertex]) {
                    dist[adj] = Math.max(dist[adj], dist[vertex] + 1);
                }
            }
        }
        int asInt = Arrays.stream(dist).max().getAsInt();
        System.out.println(asInt);
    }

    public static List<Integer> topologicalSort(List<Integer>[] edges, int[] inDegree, int N) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                stack.push(i);
            }
        }

        List<Integer> sorted = new ArrayList<>();
        while (!stack.isEmpty()) {
            Integer element = stack.pop();
            sorted.add(element);
            if (edges[element] != null) {
                for (Integer e : edges[element]) {
                    inDegree[e]--;
                    if (inDegree[e] == 0) stack.push(e);
                }
            }
        }
        return sorted;
    }

}
