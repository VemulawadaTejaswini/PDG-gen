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
        // String S = sc.next();
        char[] S = in.next().toCharArray();
        // String T = sc.next();
        char[] T = in.next().toCharArray();
        int N_S = S.length;
        int N_T = T.length;
        long[] ruiseki_S = new long[N_S+1];
        long[] ruiseki_T = new long[N_T+1];
        for (int i=0;i<N_S;i++) {
            int add=0;
            if (S[i]=='A') add=1;
            else add=2;
            ruiseki_S[i+1] = ruiseki_S[i]+add;
        }
        for (int i=0;i<N_T;i++) {
            int add=0;
            if (T[i]=='A') add=1;
            else add=2;
            ruiseki_T[i+1] = ruiseki_T[i]+add;
        }

        int Q = in.nextInt();
        for (int i=0;i<Q;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (((ruiseki_S[b]-ruiseki_S[a-1])-(ruiseki_T[d]-ruiseki_T[c-1]))%3==0) out.println("YES");
            else out.println("NO");
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