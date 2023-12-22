import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static Scanner sc = new Scanner();

    public static void main(final String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int first = (int) pq.poll();
            first = first/2;
            pq.add(first);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
          ans += (int)pq.poll();
        }
        System.out.println(ans);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
