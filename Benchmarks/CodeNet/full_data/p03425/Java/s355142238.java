import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;
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
        March solver = new March();
        solver.solve(1, in, out);
        out.close();
    }

    static class March {
        Set<String> m;
        Set<String> a;
        Set<String> r;
        Set<String> c;
        Set<String> h;
        Set<String> pattern;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            pattern = new HashSet<>();
            m = new HashSet<>();
            a = new HashSet<>();
            r = new HashSet<>();
            c = new HashSet<>();
            h = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String str = in.next();
                if (str.charAt(0) == 'M') {
                    m.add(str);
                }
                if (str.charAt(0) == 'A') {
                    a.add(str);
                }
                if (str.charAt(0) == 'R') {
                    r.add(str);
                }
                if (str.charAt(0) == 'C') {
                    c.add(str);
                }
                if (str.charAt(0) == 'H') {
                    h.add(str);
                }
            }
            List<Character> list = new ArrayList<>();
            dfs(list);
            long result = 0;
            for (String s : pattern) {
                result += (cSize(s.charAt(0)) * cSize(s.charAt(1)) * cSize(s.charAt(2)));
            }

            out.println(result);
        }

        public void dfs(List<Character> list) {
            if (list.size() == 3) {
                Collections.sort(list);
                pattern.add(list.stream().map(String::valueOf).collect(Collectors.joining()));
                return;
            } else {
                if (!list.contains('M')) {
                    List<Character> next = new ArrayList<>(list);
                    next.add('M');
                    dfs(next);
                }
                if (!list.contains('A')) {
                    List<Character> next = new ArrayList<>(list);
                    next.add('A');
                    dfs(next);
                }
                if (!list.contains('R')) {
                    List<Character> next = new ArrayList<>(list);
                    next.add('R');
                    dfs(next);
                }
                if (!list.contains('C')) {
                    List<Character> next = new ArrayList<>(list);
                    next.add('C');
                    dfs(next);
                }
                if (!list.contains('H')) {
                    List<Character> next = new ArrayList<>(list);
                    next.add('H');
                    dfs(next);
                }
            }
        }

        public long cSize(Character ch) {
            if (ch == 'M') {
                return m.size();
            }
            if (ch == 'A') {
                return a.size();
            }
            if (ch == 'R') {
                return r.size();
            }
            if (ch == 'C') {
                return c.size();
            }
            if (ch == 'H') {
                return h.size();
            }
            return 0;
        }

    }
}

