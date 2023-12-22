import java.util.*;
public class Main {
    static int N;
    static int M;
    static List[] graph;
    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        graph = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt() - 1;
            B[i] = sc.nextInt() - 1;
            graph[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            graph[B[i]].add(A[i]);
            graph[A[i]].add(B[i]);
        }
        Set<Integer> visited = new HashSet<Integer>();
        visited.add(0);
        helper(visited, 0);
        System.out.println(res);
    }

    private static void helper(Set<Integer> visited, int node) {
        if (visited.size() == N) {
            res++;
            return;
        }
        List<Integer> next = graph[node];
        for (int n : next) {
            if (visited.contains(n)) continue;
            visited.add(n);
            helper(visited, n);
            visited.remove(n);
        }
    }
}
