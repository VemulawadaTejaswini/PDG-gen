import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int E = scanner.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int start = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;
            graph.get(start).add(end);
        }

        int dp[] = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = Math.max(result, logesntPath(i, dp, graph));
        }
        System.out.println(result-1);
    }

    public static int logesntPath(int vertex, int[] dp, List<List<Integer>> graph) {
        if (dp[vertex] != 0) {
            return dp[vertex];
        }
        int result = 0;
        for (int  end : graph.get(vertex)) {
            result = Math.max(result, logesntPath(end, dp, graph));
        }
        dp[vertex] = result + 1;
        return dp[vertex];
    }
}
