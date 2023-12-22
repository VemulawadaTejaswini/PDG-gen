import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static int Q;
    static ArrayList<Integer>[] G;
    static long[] counter;
    static long[] ans;

    public static void init() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        Q = scanner.nextInt();

        G = new ArrayList[N];
        for(int i = 0; i < N; i++) G[i] = new ArrayList<>();
        for(int i = 0; i < N - 1; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            G[from].add(to);
            G[to].add(from);
        }

        counter = new long[N];
        for(int i = 0; i < Q; i++) {
            int target = scanner.nextInt() - 1;
            int count = scanner.nextInt();
            counter[target] += count;
        }

        ans = new long[N];

        scanner.close();
    }

    public static void dfs(int cur, int prev, long prop) {
        ans[cur] += counter[cur] + prop;

        for(int to: G[cur]) {
            if(to != prev) dfs(to, cur, counter[cur] + prop);
        }

    }

    public static void main(String[] args) {
        init();

        dfs(0, 0, 0);

        for(int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

