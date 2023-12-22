import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Star Orpheus
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = in.readIntArray(n);
            Arrays.sort(a);
            long ans = a[0];

            for (int i = 1; i < n; i++) {
                ans += Long.min(x + a[0], a[i]);
            }

            out.println(ans);
        }

    }

    static class FastScanner {
        final static int BUFFER_SIZE = 65536;
        BufferedReader br;
        char[] buf = new char[BUFFER_SIZE];
        int len = 0;
        int it = 0;
        boolean end = false;

        boolean delim(char c) {
            return c == ' ' || c == '\n' || c == '\r';
        }

        void fillBuffer() {
            try {
                len = br.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void ensureBuffer() {
            if (it == len) {
                it = 0;
                fillBuffer();
                if (len == -1) end = true;
            }
        }

        void moveNext() {
            while (!end) {
                ensureBuffer();
                if (!delim(buf[it])) return;
                while (it < len && delim(buf[it])) it++;
            }
        }

        public int nextInt() {
            moveNext();
            if (buf[it] == '-') {
                it++;
                return -nextInt();
            }
            if (buf[it] == '+') {
                it++;
                return nextInt();
            }
            int result = 0;
            while (!end) {
                int l = it;
                while (it < len && !delim(buf[it])) {
                    result = (result * 10) + buf[it] - '0';
                    it++;
                }
                ensureBuffer();
                if (end || delim(buf[it])) break;
            }
            return result;
        }

        public FastScanner(String file) {
            try {
                br = new BufferedReader(new FileReader(file), BUFFER_SIZE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is), BUFFER_SIZE);
        }

        public int[] readIntArray(int count) {
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) arr[i] = nextInt();
            return arr;
        }

    }
}

