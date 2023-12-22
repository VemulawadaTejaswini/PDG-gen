import java.util.*;

public class Main {

    static void dfs(int at, int prev) {
        if (prev != -1)
            counter[at] += counter[prev];

        for (Integer e : graph.get(at)) {
            if(e == prev) continue;
            dfs(e, at);
        }
    }

    static int N;
    static int Q;
    static List<List<Integer>> graph;
    static long[] counter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        counter = new long[N];
        graph = new ArrayList<>();
        
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        
        for (int i = 0; i < N-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < Q; ++i) {
            int id = sc.nextInt() - 1;
            int x = sc.nextInt();
            counter[id] += x;
        }

        dfs(0, -1);

        for (int i = 0; i < N; ++i)
            System.out.print(counter[i] + " ");
        System.out.println();
    }
}