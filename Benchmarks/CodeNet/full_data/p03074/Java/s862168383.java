import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.nextLine();
            ArrayList<DHandstand.Pair> p = new ArrayList<>();
            p.add(new DHandstand.Pair(s.charAt(0) - '0', 1));
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) - '0' == p.get(p.size() - 1).x) {
                    p.get(p.size() - 1).y++;
                } else {
                    p.add(new DHandstand.Pair(s.charAt(i) - '0', 1));
                }
            }
            long sum = 0;
            int i;
            for (i = 0; i < n; i++) {
                if (p.get(i).x == 0 && k == 0) break;
                if (p.get(i).x == 0) {
                    k--;
                }
                sum += p.get(i).y;
            }
            int start = 0;
            int end = i - 1;
            long ans = sum;
            while (start < p.size() && end < p.size()) {
                if (p.get(start).x == 0) {
                    sum -= p.get(start).y;
                    if (end < p.size() - 2) {
                        sum += p.get(end + 1).y;
                        sum += p.get(end + 2).y;
                        end += 2;
                        start++;
                    } else if (end < p.size() - 1) {
                        sum += p.get(end + 1).y;
                        end++;
                        start++;
                    } else {
                        end++;
                    }
                } else {
                    sum -= p.get(start).y;
                    start++;
                }
                ans = Math.max(ans, sum);
            }
            out.println(ans);
        }

        static class Pair {
            int x;
            int y;

            Pair(int a, int b) {
                x = a;
                y = b;
            }

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
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

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

