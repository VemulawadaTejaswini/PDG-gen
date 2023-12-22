import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static PrintWriter out;

    private static <T> void mprintln(T... ar) {
        for (T i : ar) {
            out.print(i + " ");
        }
        out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Input from file
        // File inputFile = new File("JavaFile.txt");
        // File outputFile = new File("JavaOutputFile.txt");
        // FileReader fileReader = new FileReader(inputFile);
        // Here it ends

        MyScanner sc = new MyScanner();
        // MyScanner sc = new MyScanner(fileReader);

        out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console
        // out = new PrintWriter(new PrintStream(outputFile)); // Output to file

        getAns(sc);

        out.close();
    }

    /*
     *Don't use builtin function (Math.ceil)
     */

    static final long MOD = (long) (1e9 + 7);

    private static void getAns(MyScanner sc) {
        int n = sc.ni(), q = sc.ni();
        ArrayList<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.ni(), b = sc.ni();
            tree[a].add(b);
            tree[b].add(a);
        }

        long[] ans = new long[n];

        while (q-- > 0) {
            int p = sc.ni(), x = sc.ni();
            ans[p - 1] += x;
        }

        dfs(tree, ans, 1, new boolean[n + 1], 0);

        Arrays.stream(ans)
              .forEach(cur -> out.print(cur + " "));
    }

    private static void dfs(final ArrayList<Integer>[] tree,
                            final long[] ans,
                            final int src,
                            final boolean[] visited,
                            final long valueToAdd) {

        visited[src] = true;
        ans[src - 1] += valueToAdd;

        tree[src].stream()
                 .filter(in -> !visited[in])
                 .forEach(in -> dfs(tree, ans, in, visited, ans[src - 1]));
    }

    static class MyScanner {

        BufferedReader br;
        StringTokenizer st;

        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }

        char nc() {
            return nn().charAt(0);
        }

        int ni() {
            return Integer.parseInt(nn());
        }

        long nl() {
            return Long.parseLong(nn());
        }

        double nd() {
            return Double.parseDouble(nn());
        }

        int[] niArr0(int n) {
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = ni();
            }
            return ar;
        }

        int[] niArr1(int n) {
            int[] ar = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = ni();
            }
            return ar;
        }

        long[] nlArr0(int n) {
            long[] ar = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nl();
            }
            return ar;
        }

        long[] nlArr1(int n) {
            long[] ar = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nl();
            }
            return ar;
        }
    }
}
