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
        int H = in.nextInt();
        Integer[] a = new Integer[N];
        Integer[] b = new Integer[N];
        for (int i=0;i<N;i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        Arrays.sort(a, (x, y) -> Integer.compare(y, x));
        Arrays.sort(b, (x, y) -> Integer.compare(y, x));

        int ans = 0;
        for (int i=0;i<N;i++) {
            if (a[0]>b[i]) {
                break;
            }
            H -= b[i];
            ans++;
            if (H<=0) {
                break;
            }
        }
        if (H>0) {
            ans += Math.ceil((double)H/a[0]);
        }
        out.println(ans);

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
