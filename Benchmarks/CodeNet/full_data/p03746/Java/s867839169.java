import java.io.*;
import java.util.*;

public class Main implements Runnable {

    ArrayList<Integer>[] adj;

    int N,M;
    boolean[] used;
    int best = 0;

    int[] queue = new int[100001];
    int id = 0;
    int[] ret;

    private void solve() throws IOException {



        ret = new int[100001];

        N = nextInt();
        M = nextInt();
        used = new boolean[N  + 1];
        adj = new ArrayList[ N + 1];
        for(int i = 0;i <= N; ++i) adj[i] = new ArrayList<>();
        int[] degree = new int[N + 1];
        for(int m = 0; m < M; ++m) {
            int a = nextInt();
            int b = nextInt();
            adj[a].add(b);
            adj[b].add(a);
            degree[a]++;
            degree[b]++;
        }
        Random random = new Random(23902390293023L);
        for(int iter = 0; iter < 100; ++iter) {
            int start = random.nextInt(N);
            if(start == 0) ++start;
            if(degree[start] > 2) continue;
            Arrays.fill(used, false);
            id = 0;
            dfs(start);
        }

        writer.println(best);
        writer.print(ret[0]);
        for(int i = 1; i < best; ++i) writer.print(" " + ret[i]);
        writer.println();

    }

    private void dfs(int v) {
        used[v] = true;
        queue[id++] = v;
        for(int to : adj[v]) {
            if(!used[to]) {
                dfs(to);
            }
        }
        if(best < id) {
            best = id;
            for(int j = 0; j < id; ++j) ret[j] = queue[j];
        }
        --id;
        if(id < 0) id = 0;

    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
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

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}