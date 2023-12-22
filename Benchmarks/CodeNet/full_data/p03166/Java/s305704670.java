import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProblemG.problemG_LongestPath();
    }
}

class ProblemG {
    /* Idea: build DP of the longest path from each node i
    * DP[i] = max{DP[c] + 1 | c is the child node of node i}
    * ans is max{DP[i]}
    * */
    static int N;
    static int M;
    static ArrayList<Integer>[] graph;
    static Integer[] memo;

    static void problemG_LongestPath() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            // add the edges
            graph[sc.nextInt()].add(sc.nextInt());
        }

        int[] DP = new int[N + 1];
        memo = new Integer[N + 1];

        int max = 0;
        for (int i=1; i<= N; i++) {
            if (memo[i] == null) {
                int dfs_i = DFS(i);
                max = Math.max(dfs_i, max);
//                System.out.println("DFS[" + i + "] = " +dfs_i);
//                System.out.println("memo[i] = " + memo[i]);
            }
        }
        System.out.println(max);
    }

    static int DFS(int i) {
        if (memo[i]!=null) return memo[i];
        int ret = 0;
        for (int v: graph[i]) {
            ret = Math.max(ret, 1 + DFS(v));
        }
      	memo[i] = ret;
        return ret;
    }
}
