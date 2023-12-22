import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int M = in.nextInt();
        int R = in.nextInt();
        int[] r = new int[R];
        long INF = Long.MAX_VALUE-111111111111;
        long[][] map = new long[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (i!=j) {
                    map[i][j]=(long)INF;
                }
            }
        }
        for (int i=0;i<R;i++) {
            r[i] = in.nextInt()-1;
        }
        int[] A = new int[M];
        int[] B = new int[M];
        int[] C = new int[M];
        for (int i=0;i<M;i++) {
            A[i] = in.nextInt()-1;
            B[i] = in.nextInt()-1;
            C[i] = in.nextInt();
            map[A[i]][B[i]]=(long)C[i];
            map[B[i]][A[i]]=(long)C[i];
        }
        for (int k=0;k<N;k++) {
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    map[i][j] = (long)Math.min(map[i][j], map[i][k]+map[k][j]);
                }
            }
        }
        long ans = INF;
        do {
            long tmp = 0;
            for (int i=0;i<r.length-1;i++) {
                tmp += map[r[i]][r[i+1]];
            }
            ans = Math.min(ans, tmp);
        } while (next_permutation(r));
        out.println(ans);
        out.close();
    }
    static boolean next_permutation(int[] p) {
      for (int a = p.length - 2; a >= 0; --a)
        if (p[a] < p[a + 1])
          for (int b = p.length - 1;; --b)
            if (p[b] > p[a]) {
              int t = p[a];
              p[a] = p[b];
              p[b] = t;
              for (++a, b = p.length - 1; a < b; ++a, --b) {
                t = p[a];
                p[a] = p[b];
                p[b] = t;
              }
              return true;
            }
      return false;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
