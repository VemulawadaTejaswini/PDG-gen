import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

import static java.util.Arrays.binarySearch;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 1000000007;


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Integer[] a = new Integer[1 << n];
        for (int i = 0; i < (1 << n); i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        out.println(ok(a, n) ? "Yes" : "No");

    }

    private boolean ok(Integer[] a, int n) {
        int cur = 0;
        Queue<Slime> q = new LinkedList<>();
        q.add(new Slime(a[cur++], 0, 0));
        while (!q.isEmpty()) {
            Slime s = q.poll();
            // 0 1 2 4 8 16
            // 1 3 5 9 17
            // 2 6 10
            for (int st = s.turn; st < n; st++) {
                if (s.hel <= a[cur]) {
                    return false;
                }
                q.add(new Slime(a[cur++], s.pos + (1 << st), st + 1));
            }
        }
        return true;
    }

    class Slime {
        int hel;
        int pos;
        int turn;

        public Slime(int hel, int pos, int turn) {
            this.hel = hel;
            this.pos = pos;
            this.turn = turn;
        }
    }


}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
