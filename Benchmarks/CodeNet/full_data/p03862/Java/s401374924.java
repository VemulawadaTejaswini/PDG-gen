//package AtCoder.Indeed11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        int n = in.NI(); long x = in.NL();
        long[] q = new long[n];
        long[] q2 = new long[n];
        for (int i=0;i<n;i++) q[i] = in.NL();
        for (int i=0;i<n;i++) q2[i] = q[i];

        long ans = Long.MAX_VALUE;
        long tans = 0;
        for (int i=0;i<n-1;i++) {
            int j = i + 1;
            long tobesub = Long.max(0, q[j] + q[i] - x);
            if (q[j]>=tobesub) {
                q[j]-=tobesub;
                tans += tobesub;
                tobesub=0;
            } else {
                q[j] = 0; tobesub-=q[j];
                tans+=q[j];
            }

            if (tobesub>0) {
                q[i]-=tobesub; tans+=tobesub;
                tobesub=0;
            }
        }

        ans = Long.min(tans, ans);
        tans = 0;

        for (int i=0;i<n-1;i++) {
            int j = i + 1;
            long tobesub = Long.max(0, q2[j] + q2[i] - x);
            if (q2[i]>=tobesub) {
                q2[i]-=tobesub;
                tans += tobesub;
                tobesub=0;
            } else {
                q2[i] = 0; tobesub-=q2[i];
                tans+=q2[i];
            }

            if (tobesub>0) {
                q2[j]-=tobesub; tans+=tobesub;
                tobesub=0;
            }
        }
        ans = Long.min(tans, ans);
        out.println(ans);

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