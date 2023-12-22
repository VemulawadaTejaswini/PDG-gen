import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static ArrayList<Integer> Vertices[];
    public static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter p = new PrintWriter(System.out);
        N = sc.nextInt();
        M = sc.nextInt();

        Vertices = new ArrayList[N + 1];
        dp = new int[N + 1];

        for(int i=1; i<=N; ++i)
            Vertices[i] = new ArrayList<>();

        for (int m = 1; m <= M; ++m) {
            int beg = sc.nextInt();
            int end = sc.nextInt();
            Vertices[beg].add(end);
        }

        int r = 0;

        for (int i = 1; i <= N; ++i) {
            if (Vertices[i].size() > 0) {
                r = Math.max(r, dfs(i));
            }
        }

        p.println(r);
        p.close();
    }

    public static int dfs(int idxBegVertex) {
        if(dp[idxBegVertex] > 0) {
            return dp[idxBegVertex];
        }

        for(int idxEndVertex: Vertices[idxBegVertex]) {
            dfs(idxEndVertex);
            dp[idxBegVertex] = Math.max(dp[idxBegVertex], dp[idxEndVertex] + 1);
        }

        return dp[idxBegVertex];
    }
}
