import java.io.*;
import java.util.*;

public class Main implements Runnable {

    long[] ans;
    long[] vSum;
    int N;
    ArrayList<Integer>[] edges;
    private void solve() throws IOException {

        N = nextInt();
        int Q = nextInt();
        vSum = new long[ N + 1];
        edges = new ArrayList[N+1];
        ans = new long[N + 1];
        for(int i = 0; i <= N; ++i) {
            edges[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; ++i) {
            int a = nextInt();
            int b = nextInt();
            edges[a].add(b);
        }

        for(int i = 0; i < Q; ++i) {
            int p1 = nextInt();
            long x2 = nextLong();
            vSum[p1] += x2;
        }
        dfs(1, 0L);
        writer.print(ans[1]);
        for(int i = 2; i <= N; ++i) {
            writer.print(" " + ans[i]);
        }
        writer.println();

    }

    public void dfs(int v, long sum) {
        ans[v] = vSum[v] + sum;
        for(int child : edges[v]) {
            dfs(child, ans[v]);
        }
    }

    public static void main(String[] args) {

        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("a_1.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new PrintWriter("aa_1.txt");
            solve();
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextToken() throws IOException {
        while(tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }
}
