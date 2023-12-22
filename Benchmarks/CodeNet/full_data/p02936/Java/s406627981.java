import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N, Q;
        List<Set<Integer>> nextNode = new ArrayList<>();
        int[] score;
        int[] counter;

        void calc(int node, int curSum) {
            counter[node] = curSum;
            for (int child : nextNode.get(node)) {
                nextNode.get(child).remove(node);
                calc(child, curSum + score[child]);
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            Q = in.nextInt();
            score = new int[N];
            counter = new int[N];
            Arrays.fill(score, 0);
            Arrays.fill(counter, 0);
            for (int i = 0; i < N; ++i) {
                nextNode.add(new HashSet<>());
            }

            for (int i = 0; i < N - 1; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                nextNode.get(a).add(b);
                nextNode.get(b).add(a);
            }

            for (int i = 0; i < Q; ++i) {
                int p = in.nextInt() - 1;
                int x = in.nextInt();
                score[p] += x;
            }

            calc(0, score[0]);

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; ++i) {
                ans.append(counter[i]).append(' ');
            }
            out.println(ans.toString().trim());
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}