import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
            String[] s = new String[N];
            for (int i = 0; i < N; i++) {
                s[i] = in.next();
            }
            long counter = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (isAnagramBySort(s[i], s[j])) {
                        counter++;
                    }
                }
            }
            out.println(counter);
        }

        static boolean isAnagramBySort(String s1, String s2) {
            List<String> s1List = new ArrayList<>();
            List<String> s2List = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                s1List.add(String.valueOf(s1.charAt(i)));
                s2List.add(String.valueOf(s2.charAt(i)));
            }
            Collections.sort((s1List));
            Collections.sort((s2List));
            for (int i = 0; i < s1.length(); i++) {
                if (!s1List.get(i).equals(s2List.get(i))) {
                    return false;
                }
            }
            return true;
        }

    }
}

