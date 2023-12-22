import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int Q;
    static ArrayList<Integer>[] G;
    static long[] counter;
    static long[] ans;

    public static void init() {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        N = in.nextInt();
        Q = in.nextInt();

        G = new ArrayList[N];
        for(int i = 0; i < N; i++) G[i] = new ArrayList<>();
        for(int i = 0; i < N - 1; i++) {
            int from = in.nextInt() - 1;
            int to = in.nextInt() - 1;
            G[from].add(to);
            G[to].add(from);
        }

        counter = new long[N];
        for(int i = 0; i < Q; i++) {
            int target = in.nextInt() - 1;
            int count = in.nextInt();
            counter[target] += count;
        }

        ans = new long[N];

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

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
