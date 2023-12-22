import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static final long MOD = (long) (1e9 + 7);
    private static PrintWriter out;

    public static void main(String[] args) throws FileNotFoundException {

        /* Input from file */

        // File inputFile = new File("JavaFile.txt");
        // File outputFile = new File("JavaOutputFile.txt");
        // FileReader fileReader = new FileReader(inputFile);

        /* Here it ends */

        MyScanner sc = new MyScanner(); // Input from console.
        // MyScanner sc = new MyScanner(fileReader); // Input from file.

        out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console.
        // out = new PrintWriter(new PrintStream(outputFile)); // Output to file.

        int test = 1;
        for (int i = 0; i < test; i++) {
            getAns(sc);
        }

        out.close();
    }

    private static void mprintln(Object... ar) {
        for (Object i : ar) {
            out.print(i + " ");
        }
        out.println();
    }

    private static void mprint(Object... ar) {
        for (Object i : ar) {
            out.print(i + " ");
        }
    }

    /**
     * Don't use built-in function (Math.ceil).
     */
    private static void getAns(MyScanner sc) {
        int n = sc.ni();

        for (int i = 1; i <= 9; i++) for (int j = 1; j <= 9; j++) if (i * j == n) {
            out.println("Yes");
            return;
        }

        out.println("No");
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

        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = ni();
            }
            return ar;
        }

        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = ni();
            }
            return ar;
        }

        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nl();
            }
            return ar;
        }

        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nl();
            }
            return ar;
        }
    }
}