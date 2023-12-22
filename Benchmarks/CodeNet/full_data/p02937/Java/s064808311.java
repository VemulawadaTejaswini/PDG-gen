import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
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
        StringsofImpurity solver = new StringsofImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class StringsofImpurity {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            char[] s = str.toCharArray();
            char[] t = in.next().toCharArray();

            Map<Character, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < s.length; i++) {
                List<Integer> list = map.getOrDefault(s[i], new ArrayList<>());
                list.add(i + 1);
                map.put(s[i], list);
            }

            for (char c : t) {
                if (!map.containsKey(c)) {
                    out.print(-1);
                    return;
                }
            }

            int pre = map.get(t[0]).get(0);
            long result = pre;

            for (int i = 1; i < t.length; i++) {
                List<Integer> pos = map.get(t[i]);
                int position = Collections.binarySearch(pos, pre + 1);
                if (position < 0) {
                    position = ~position;
                }
                int now;
                if (position == pos.size()) {
                    result += s.length;
                    now = pos.get(0);

                } else {
                    now = pos.get(position);
                }
                result += (now - pre);
                pre = now;
            }

            out.print(result);

        }

    }
}

