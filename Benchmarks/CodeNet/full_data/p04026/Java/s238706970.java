import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kishore
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextLine();
            if (s.length() >= 2) {
                int arr[][] = new int[s.length()][26];
                for (int i = 0; i < s.length(); i++) {
                    arr[i] = findArr(s.substring(i));
                }
                for (int i = 0; i < s.length() - 1; i++) {
                    if (max(arr[i]) > (s.length() - i) / 2) {
                        out.println((i + 1) + " " + s.length());
                        return;
                    }
                }
                for (int i = 0; i < s.length(); i++) {
                    for (int j = i + 2; j < s.length(); j++)
                        if (diff(arr[i], arr[j], s.substring(i, j - 1)) > (j - i) / 2) {
                            out.println((i + 1) + " " + j);
                            return;
                        }
                }
            }
            out.println("-1 -1");
        }

        private int diff(int[] a, int[] b, String s) {
            if (s.length() < 26) {
                int max = a[0] - b[0];
                for (int i = 0; i < s.length(); i++) {
                    int pos = (int) (s.charAt(i) - 'a');
                    if (a[pos] - b[pos] > max) max = a[pos] - b[pos];
                }
                return max;
            }
            int max = a[0] - b[0];
            for (int i = 1; i < 26; i++) {
                if (a[i] - b[i] > max) max = a[i] - b[i];
            }
            return max;
        }

        private int max(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < 26; i++)
                if (max < arr[i]) max = arr[i];
            return max;
        }

        private int[] findArr(String s) {
            int[] sol = new int[26];
            for (int i = 0; i < s.length(); i++) {
                sol[(int) (s.charAt(i) - 'a')]++;
            }
            return sol;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

