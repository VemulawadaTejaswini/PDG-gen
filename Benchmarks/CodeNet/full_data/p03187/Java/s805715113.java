import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Burning trees.
 */
public class Main {

    private int N, L;
    private List<Tree> trees;
    private long maxPath = 0;
    private String direction;
    private int maxPrefix;

    public static void main(String[] args) throws FileNotFoundException {
//        InputReader reader = new InputReader(new FileInputStream("in.txt"));
        InputReader reader = new InputReader(System.in);
        Main m = new Main();
        m.solve(reader);
        reader.close();
    }

    void solve(InputReader in) {

        L = in.nextInt();
        N = in.nextInt();

        trees = new ArrayList<>(N);
        for (int i = 0; i < N; ++i) {
            int coord = in.nextInt();
            trees.add(new Tree(coord));
        }


        checkCCW();
        checkCW();

        System.out.println(maxPath);
//        System.out.println("Direction: " + direction);
//        System.out.println("Prefix: " + maxPrefix);
    }

    private void checkCW() {

        // Number of one directional nodes to test
        for (int j = N; j >= 1; --j) {
            int left = 0;
            int right = j - 1;

            long curPath = L - trees.get(right).coord;

            // Get zigzagging pattern

            int count = 0;
            while (left < right) {
                curPath += trees.get(left).coord + L - trees.get(right).coord;
                if ((count++ & 1) == 1) {
                    left++;
                } else {
                    right--;
                }
            }

            if (maxPath < curPath) {
                direction = "Clockwise";
                maxPrefix = j;
                maxPath = curPath;
            }
        }
    }

    private void checkCCW() {

        // Number of one directional nodes to test
        for (int j = 1; j < N; ++j) {
            int left = j - 1;
            int right = N - 1;

            long curPath = trees.get(left).coord;

            // Get zigzagging pattern

            int count = 0;
            while (left < right) {
                curPath += trees.get(left).coord + L - trees.get(right).coord;
                if ((count++ & 1) == 1) {
                    right--;
                } else {
                    left++;
                }
            }

            if (maxPath < curPath) {
                direction = "CounterClockwise";
                maxPrefix = j;
                maxPath = curPath;
            }
        }

    }

    public static class Tree {
        int coord;
        boolean burned;

        Tree(int coord) {
            this.coord = coord;
            this.burned = false;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public static class InputReader {

        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream in) {
            assert in != null;
            reader = new BufferedReader(new InputStreamReader(in), Short.MAX_VALUE);
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = null;
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                StringBuilder builder = new StringBuilder();
                while (tokenizer.hasMoreTokens()) {
                    builder.append(tokenizer.nextToken());
                    builder.append(' ');
                }
                return builder.toString();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public void close() {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
