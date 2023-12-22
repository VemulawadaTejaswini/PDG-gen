//package arc086;

import java.io.*;
import java.util.*;

public class TaskD {
    public FastScanner in;
    public PrintWriter out;

    public class Pair {
        public int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public void solve() {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        if (arr[index] == 0) {
            out.println(0);
        } else if (arr[index] < 0) {
            out.println(2 * n - 2);
            for (int i = 0; i < n; i++) {
                if (i == index) continue;
                out.println((index + 1) + " " + (i + 1));
            }
            for (int i = n - 1; i >= 1; i--) {
                out.println((i + 1) + " " + i);
            }
        } else {
            out.println(2 * n - 2);
            for (int i = 0; i < n; i++) {
                if (i == index) continue;
                out.println((index + 1) + " " + (i + 1));
            }
            for (int i = 1; i < n; i++) {
                out.println(i + " " + (i + 1));
            }
        }
    }

    public void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    public void run() {
        try {
            in = new FastScanner(new File("input.txt"));
            out = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        solve();

        out.close();
    }

    public class FastScanner {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public FastScanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public FastScanner(File file) {
            try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new TaskD().runIO();
    }
}
