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
        int W_l = 1;
        int W_r = W;
        int H_d = 1;
        int H_u = H;
        for (int i=N-1;i>=0;i--) {

            // if (T_c[i]=='R') if (W_r<W) W_r++;
            // if (T_c[i]=='L') if (W_l>1) W_l--;
            // if (T_c[i]=='U') if (H_u<H) H_u++;
            // if (T_c[i]=='D') if (H_d>1) H_d--;
            if (T_c[i]=='R') if (W_l>1) W_l--;
            if (T_c[i]=='L') if (W_r<W) W_r++;
            if (T_c[i]=='U') if (H_d>1) H_d--;
            if (T_c[i]=='D') if (H_u<H) H_u++;

            if (S_c[i]=='R') W_r--;
            if (S_c[i]=='L') W_l++;
            if (S_c[i]=='U') H_u--;
            if (S_c[i]=='D') H_d++;

            if (W_l>W_r || H_d>H_u) {
                out.println("NO");
                out.close();
                return;
            }
            // out.println(W_l);
        }
        // out.println("############");
        // out.println(W_l);
        // out.println(W_r);
        // out.println(H_d);
        // out.println(H_u);
        // out.println("############");
        if (W_l<=sc && sc<=W_r && H_d<=sr && sr<=H_u) out.println("YES");
        else out.println("NO");
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
