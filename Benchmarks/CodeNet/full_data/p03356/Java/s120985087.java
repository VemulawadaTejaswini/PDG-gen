import java.io.*;
import java.util.*;

public class Main {
    /**********************************************************************************************
     *                                            DEBUG                                           *
     **********************************************************************************************/
    private interface InputType {
        int STANDARD = 0;
        int FILE = 1;
        int HARDCODE = 2;
    }

    private final static int INPUT_TYPE = InputType.STANDARD;
    private final static String[] HARDCODE_INPUT = {
            "5 2\n" +
                    "5 3 1 4 2\n" +
                    "1 3\n" +
                    "5 4",
            "3 2\n" +
                    "3 2 1\n" +
                    "1 2\n" +
                    "2 3",
            "10 8\n" +
                    "5 3 6 8 7 10 9 1 2 4\n" +
                    "3 1\n" +
                    "4 1\n" +
                    "5 9\n" +
                    "2 5\n" +
                    "6 5\n" +
                    "3 5\n" +
                    "8 9\n" +
                    "7 9",
            "5 1\n" +
                    "1 2 3 4 5\n" +
                    "1 5"
    };
    private final static String FILE_INPUT_DIR = new File("").getAbsolutePath()
            + "/src/common/template";



    /**********************************************************************************************
     *                                             MAIN                                           *
     **********************************************************************************************/
    private static class Solver {
        private static final int MIN = -999_999_999;
        private static final int MAX = 999_999_999;

        public void solve(Reader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n + 1];
            List<Integer>[] map = new List[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                map[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                map[u].add(v);
                map[v].add(u);
            }

            List<Set<Integer>> cc = new ArrayList<>(); // connected components
            boolean[] been = new boolean[n+1];
            for (int i = 1; i <= n; i++) {
                if (!been[i]) {
                    Set<Integer> list = new HashSet<>();
                    dfs(list, map, been, i);
                    cc.add(list);
                }
            }

            int res = 0;
            for (Set<Integer> list : cc) {
                for (int i : list) {
                    if (list.contains(a[i])) res++;
                }
            }
            out.println(res);
        }

        private void dfs(Set<Integer> list, List<Integer>[] map, boolean[] been, int u) {
            been[u] = true;
            list.add(u);
            for (int v : map[u]) {
                if (!been[v]) {
                    dfs(list, map, been, v);
                }
            }
        }
    }



    /**********************************************************************************************
     *                                           TEMPLATE                                         *
     **********************************************************************************************/
    public static void main(String[] args) throws IOException {
        PrintWriter out;
        Reader in;
        if (INPUT_TYPE == InputType.FILE) {
            for (File file : new File(FILE_INPUT_DIR).listFiles()) {
                if (file.getName().contains(".in")) {
                    solveFile(file.getAbsolutePath());
                }
            }
        } else if (INPUT_TYPE == InputType.HARDCODE) {
            for (String s : HARDCODE_INPUT) {
                solveHardCode(s);
            }
        } else { // STANDARD
            in = new Reader(System.in);
            out = new PrintWriter(System.out);
            new Solver().solve(in, out);
            out.flush();
        }
    }

    private static void solveHardCode(String input) throws IOException {
        // prepare
        Reader in = new Reader(new ByteArrayInputStream(input.getBytes()));
        PrintWriter out = new PrintWriter(System.out);
        out.println("===>>> INPUT");
        out.println(input + "\n\n");
        out.println("===>>> OUTPUT");

        // solve
        long start = System.currentTimeMillis();
        new Solver().solve(in, out);
        long end = System.currentTimeMillis();

        // log
        out.println("\n");
        out.println("===========");
        out.println("Took: " + (end - start) + "ms");
        out.println("====================================================================");
        out.println();
        out.println();
        // flush
        out.flush();
    }

    private static void solveFile(String inputPath) throws IOException {
        // prepare
        int idx = inputPath.lastIndexOf("in");
        String outputPath = inputPath.substring(0, idx) + "out";
        Reader in = new Reader(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        // solve
        long start = System.currentTimeMillis();
        new Solver().solve(in, out);
        long end = System.currentTimeMillis();

        // flush to file
        out.flush();

        // replace with standard output for logging
        out = new PrintWriter(System.out);

        // log
        out.println("\n");
        out.println("Input path: " + inputPath);
        out.println("Output path: " + outputPath);
        out.println("===========");
        out.println("Took: " + (end - start) + "ms");
        out.println("====================================================================");
        out.flush();
    }

    /** Reader **/
    private static class Reader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public Reader(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        private String nextWord() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        private int nextInt() throws IOException {
            return Integer.parseInt(nextWord());
        }

        private long nextLong() throws IOException {
            return Long.parseLong(nextWord());
        }

        private double nextDouble() throws IOException {
            return Double.parseDouble(nextWord());
        }
    }
}
