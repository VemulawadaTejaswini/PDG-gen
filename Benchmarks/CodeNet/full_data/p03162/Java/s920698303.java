import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);

        int n = in.nextInt();
        StringBuilder output = new StringBuilder();

        int sum = 0, prev = -1, maxPos = 0, secMaxPos = 0;
        boolean equalFlag = false;
        for (int i = 0; i < n; ++i) {
            String[] s = in.nextLine().split(" ");

            if (toInt(s[0]) >= toInt(s[1])) {
                if (toInt(s[0]) >= toInt(s[2])) {
                    maxPos = 0;
                    equalFlag = toInt(s[0]) == toInt(s[2]);
                    if (toInt(s[1]) > toInt(s[2]))
                        secMaxPos = 1;
                    else
                        secMaxPos = 2;
                } else {
                    maxPos = 2;
                    if (toInt(s[0]) > toInt(s[1]))
                        secMaxPos = 0;
                    else
                        secMaxPos = 1;
                }
            } else {
                if (toInt(s[1]) >= toInt(s[2])) {
                    maxPos = 1;
                    equalFlag = toInt(s[1]) == toInt(s[2]);
                    if (toInt(s[0]) > toInt(s[2]))
                        secMaxPos = 0;
                    else
                        secMaxPos = 2;
                } else {
                    maxPos = 2;
                    if (toInt(s[0]) > toInt(s[1]))
                        secMaxPos = 0;
                    else
                        secMaxPos = 1;
                }
            }

            if (i == 0) {
                sum += toInt(s[maxPos]);
                prev = maxPos;
                continue;
            }

            if (prev == maxPos) {
                if (equalFlag) {
                    sum += toInt(s[maxPos]);
                    prev = maxPos;
                } else {
                    sum += toInt(s[secMaxPos]);
                    prev = secMaxPos;
                }

                equalFlag = false;
            } else {
                sum += toInt(s[maxPos]);
                prev = maxPos;
            }
        }

        output.append(sum);

        System.out.print(output);
    }

    static int toInt(String c) {
        return Integer.parseInt(c);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
