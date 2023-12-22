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
        for (int i=1;i<n;i+=2) {
            long tobesub;
            long mval;

            if (i>0) {
                tobesub = Math.max(0, q[i] + q[i - 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }

            if (i<n-1) {
                tobesub = Math.max(0, q[i] + q[i + 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }
        }

        for (int i=0;i<n;i+=2) {
            long tobesub;
            long mval;
            if (i>0) {
                tobesub = Math.max(0, q[i] + q[i - 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }

            if (i<n-1) {
                tobesub = Math.max(0, q[i] + q[i + 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }
        }

        ans = Long.min(tans, ans);
        tans = 0;

        for (int i=0;i<n;i++) q[i] = q2[i];

        for (int i=0;i<n;i+=2) {
            long tobesub;
            long mval;

            if (i>0) {
                tobesub = Math.max(0, q[i] + q[i - 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }

            if (i<n-1) {
                tobesub = Math.max(0, q[i] + q[i + 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }
        }

        for (int i=1;i<n;i+=2) {
            long tobesub;
            long mval;
            if (i>0) {
                tobesub = Math.max(0, q[i] + q[i - 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
            }

            if (i<n-1) {
                tobesub = Math.max(0, q[i] + q[i + 1] - x);
                mval = Math.min(q[i], tobesub);
                tans += mval;
                q[i] -= mval;
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