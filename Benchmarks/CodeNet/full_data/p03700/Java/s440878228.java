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
    static int N;
    static int A;
    static int B;
    static int[] h;
    public static boolean isOK(int index) {
        long[] h_2 = new long[N];
        for (int i=0;i<N;i++) {
            h_2[i] = h[i];
            h_2[i] -= (long)B*index;
        }
        for (int i=0;i<N;i++) {
            if (h_2[i]>0) {
                index -= (h_2[i]+(A-B-1))/(A-B);
            }
        }
        if (index>=0) return true;
        else return false;
    }

    public static int binary_search() {
        int left = -1;
        int right = Integer.MAX_VALUE-100;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;

            if (isOK(mid)) right = mid;
            else left = mid;
        }
        return right;
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        N = in.nextInt();
        A = in.nextInt();
        B = in.nextInt();
        h = new int[N];
        for (int i=0;i<N;i++) {
            h[i] = in.nextInt();
        }

        out.println(binary_search());

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
