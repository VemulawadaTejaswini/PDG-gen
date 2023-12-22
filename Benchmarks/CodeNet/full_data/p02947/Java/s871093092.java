import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            char[][] s = new char[N][];
            for (int i = 0; i < N; i++) {
                s[i] = in.next().toCharArray();
            }
            long counter = 0;
            Map<String, Integer> mp = new HashMap<>();
            for (int i = 0; i < N; i++) {
                Arrays.sort(s[i]);
                if (!mp.containsKey(String.valueOf(s[i]))) {
                    mp.put(String.valueOf(s[i]), 0);
                } else {
                    mp.put(String.valueOf(s[i]), mp.get(String.valueOf(s[i])) + 1);
                }
            }

            for (String key : mp.keySet()) {
                if (mp.get(key) > 0) {
                    int setNum = mp.get(key);
                    counter += setNum * (setNum + 1) / 2;
                }
            }
            out.println(counter);
        }

    }
}

