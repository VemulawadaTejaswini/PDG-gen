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
        int V = in.nextInt();
        int E = in.nextInt();
        int L = in.nextInt();
        long[][] edge = new long[V][V];
        long INF = 200_000_000_000_000L;
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                edge[i][j] = INF;
            }
        }
        for (int i=0;i<E;i++) {
            int s = in.nextInt()-1;
            int t = in.nextInt()-1;
            long d = in.nextLong();
            edge[s][t] = d;
            edge[t][s] = d;
        }
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                          if (edge[i][j]>edge[i][k]+edge[k][j]) {
                              edge[i][j] = edge[i][k]+edge[k][j];
                          }
                    }
                }
            }
        }
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                if (edge[i][j]<=L) {
                    edge[i][j]=1;
                } else {
                    edge[i][j]=INF;
                }
            }
        }
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                          if (edge[i][j]>edge[i][k]+edge[k][j]) {
                              edge[i][j] = edge[i][k]+edge[k][j];
                          }
                    }
                }
            }
        }
        int Q = in.nextInt();;
        for (int i=0;i<Q;i++) {
            int s = in.nextInt()-1;
            int t = in.nextInt()-1;
            if (edge[s][t]==INF) {
                out.println(-1);
            } else {
                out.println(edge[s][t]-1);
            }
        }
        out.close();
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