import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        solve( i -> {
            pw.println(i);
            pw.flush();
            return sc.next().charAt(0);
        });

        sc.reader.close();
        pw.close();
        System.exit(0);
    }

    interface Query {
        char run(int i);
    }

    static void solve(Query q) {
        char c = q.run(0);
        if( c == 'V' ) return;

        int from = 1;
        int to = N-1;

        for (int i = 0; i < 19; i++) {
            // M2M型かM1F型に分類される
            // M2M -> M1?2M or M2?1M
            // M1?2M -> M1M2M or M1F2M
            // M2?1M -> M2M1M or M2M1M
            // M1F -> M2?2F or M1?1F
            // M2?2F -> M2M2F or M2F2F
            // M1?1F -> M1M1F or M1F1F
            // それぞれの場合で M2MかM1Fが存在するのでそちらに分岐していく

            int qi = (from + to)/2;
            char qc = q.run(qi);
            if( qc == 'V' ) return; // ok

            boolean mm = (c == qc);
            boolean even = (qi - from) % 2 == 0;
            if( mm && even || !mm && !even ) {
                to = qi-1;

            } else {
                from = qi+1;
                c = qc;
            }
        }

        // 21回目で死ぬと思われる
        q.run(0);
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;
        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
