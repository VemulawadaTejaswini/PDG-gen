import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMatchMatching solver = new DMatchMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMatchMatching {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = in.nextIntArray(m);
            Map<Integer, Integer> hm = new HashMap<Integer, Integer>() {{
                put(1, 2);
                put(2, 5);
                put(3, 5);
                put(4, 4);
                put(5, 5);
                put(6, 6);
                put(7, 3);
                put(8, 7);
                put(9, 6);
            }};
            List<Pair> matches = new ArrayList<>();
            for (int i : a) {
                matches.add(new Pair(i, hm.get(i)));
            }
            Collections.sort(matches, (o1, o2) -> o1.match - o2.match);
            Set<Integer> matchUsed = new HashSet<>();
            Iterator itr = matches.iterator();
            while (itr.hasNext()) {
                Pair p = (Pair) itr.next();
                for (Pair p2 : matches) {
                    if (p2.match == p.match && p2.digit > p.digit) {
                        itr.remove();
                        break;
                    }
                }
            }
            List[] dp = new List[n + 1];
            dp[0] = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                for (Pair p : matches) {
                    if (i - p.match >= 0 && dp[i - p.match] != null) {
                        dp[i] = new ArrayList<Integer>(dp[i - p.match]) {{
                            add(p.digit);
                        }};
                        break;
                    }
                }
            }
            Collections.sort(dp[n]);
            for (int i = dp[n].size() - 1; i >= 0; i--) {
                out.print(dp[n].get(i));
            }
        }

        class Pair {
            int digit;
            int match;

            Pair(int a, int b) {
                this.digit = a;
                this.match = b;
            }

        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

    }
}

