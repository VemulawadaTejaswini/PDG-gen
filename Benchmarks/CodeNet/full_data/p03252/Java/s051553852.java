import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        StringTransformation solver = new StringTransformation();
        solver.solve(1, in, out);
        out.close();
    }

    static class StringTransformation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();

            HashMap<Character, Integer> smap = new HashMap<>();
            HashMap<Character, Integer> tmap = new HashMap<>();

            for (int i = 0; i < s.length; i++) {
                smap.put(s[i], smap.getOrDefault(s[i], 0) + 1);
                tmap.put(t[i], tmap.getOrDefault(t[i], 0) + 1);
            }
            List<Integer> sa = new ArrayList<>(smap.values());
            List<Integer> ta = new ArrayList<>(tmap.values());
            Collections.sort(sa);
            Collections.sort(ta);
            for (int i = 0; i < sa.size(); i++) {
                if (!sa.get(i).equals(ta.get(i))) {
                    out.print("No");
                    return;
                }
            }
            out.print("Yes");
        }

    }
}

