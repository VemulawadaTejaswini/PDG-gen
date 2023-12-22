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

        int H = in.nextInt();
        int W = in.nextInt();
        int N = in.nextInt();
        int sr = in.nextInt();
        int sc = in.nextInt();
        String S = in.next();
        String T = in.next();
        char[] S_c = S.toCharArray();
        char[] T_c = T.toCharArray();

        int W_r = sc;
        for (int i=0;i<N;i++) {
            if (S_c[i]=='R') W_r++;
            if (W_r>W) {
                out.println("NO");
                out.close();
                return;
            }
            if (T_c[i]=='L' && W_r>1) W_r--;
        }

        int W_l = sc;
        for (int i=0;i<N;i++) {
            if (S_c[i]=='L') W_l--;
            if (W_l<1) {
                out.println("NO");
                out.close();
                return;
            }
            if (T_c[i]=='R' && W_l<W) W_l++;
        }


        int H_u = sc;
        for (int i=0;i<N;i++) {
            if (S_c[i]=='U') H_u++;
            if (H_u>H) {
                out.println("NO");
                out.close();
                return;
            }
            if (T_c[i]=='D' && H_u>1) H_u--;
        }


        int H_d = sc;
        for (int i=0;i<N;i++) {
            if (S_c[i]=='D') H_d--;
            if (H_d<1) {
                out.println("NO");
                out.close();
                return;
            }
            if (T_c[i]=='U' && W_r<H) H_d++;
        }

        out.println("YES");
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
