//package AtCoder.ABC157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        int n = in.NI(); int m = in.NI();
        int[] ans = new int[n];
        for (int i=0;i<n;i++) ans[i]=-1;
        int fl = 1;
        for (int i=0;i<m;i++) {
            int pos = in.NI()-1; int val = in.NI();
            if (pos==0 && val==0) {
                fl=0; break;
            }
            if (ans[pos]==-1) {
                ans[pos] = val;
            } else if (ans[pos] ==val) {
                continue;
            } else {
                fl=0;
            }
        }

        if (fl==0) {
            out.println(-1);
        } else {
            int poi = 0;
            if (ans[poi]==-1 && n!=1) {
                ans[poi]=1; poi++;
            } else if (n==1 && ans[poi]==0){
                ans[poi]=0; poi++;
            }
            while (poi < n) {
                if (ans[poi] == -1) ans[poi] = 0;
                poi++;
            }
            for (int i = 0; i < n; i++) out.printf("%d", ans[i]);
            out.println();
        }
        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

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

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}