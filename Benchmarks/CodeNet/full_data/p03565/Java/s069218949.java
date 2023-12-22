import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static FastScanner scanner = new FastScanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        String t = scanner.next();

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        for (int i = s.length() - t.length(); i >= 0; i--) {
            String[] sub = s.substring(i, i + t.length()).split("");
            int count = 0;
            for (int j = 0; j < sub.length; j++) {
                if (sub[j].equals("?") || sub[j].equals(tArray[j])) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == tArray.length) {
                for (int j = 0; j < tArray.length; j++) {
                    sArray[i + j] = tArray[j];
                }

                StringBuilder sb = new StringBuilder(sArray.length);
                for (int j = 0; j < sArray.length; j++) {
                    if (sArray[j].equals("?")) {
                        sb.append("a");
                    } else {
                        sb.append(sArray[j]);
                    }
                }
                System.out.println(sb.toString());
                return;
            }
        }
        System.out.println("UNRESTORABLE");

    }

    private static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            this.reader = new BufferedReader(new InputStreamReader(in));
        }

        public int[] nextLineToIntArray() {
            String[] stringArray = nextLineToStringArray();
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            return intArray;
        }

        public String[] nextLineToStringArray() {
            return nextLine().split("");
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public String next() {
            if (this.tokenizer == null || !this.tokenizer.hasMoreElements()) {
                try {
                    this.tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            return this.tokenizer.nextToken();
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

        public String[] nextStringArray(int n) {
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = next();
            }
            return stringArray;
        }

        public int[] nextIntArray(int n) {
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = nextInt();
            }
            return intArray;
        }

        public long[] nextLongArray(int n) {
            long[] longArray = new long[n];
            for (int i = 0; i < n; i++) {
                longArray[i] = nextLong();
            }
            return longArray;
        }

        public double[] nextDoubleArray(int n) {
            double[] doubleArray = new double[n];
            for (int i = 0; i < n; i++) {
                doubleArray[i] = nextDouble();
            }
            return doubleArray;
        }
    }
}
