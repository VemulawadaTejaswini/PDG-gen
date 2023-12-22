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
        CHonestOrUnkind2 solver = new CHonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHonestOrUnkind2 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            ArrayList<ArrayList<CHonestOrUnkind2.Pair>> tab = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                tab.add(new ArrayList<>());
                int a = sc.nextInt();
                for (int j = 0; j < a; j++) {
                    tab.get(i).add(new CHonestOrUnkind2.Pair(sc.nextInt() - 1, sc.nextInt()));
                }
            }
            int ans = 0;
            for (int mask = 1; mask < (1 << n); mask++) {
                ArrayList<Integer> honest = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) > 0) {
                        honest.add(i);
                    }
                }
                boolean ok = true;
                loop:
                for (int pers : honest) {
                    for (CHonestOrUnkind2.Pair p : tab.get(pers)) {
                        if (p.y == 0) {
                            for (int o : honest) {
                                if (o == p.x) {
                                    ok = false;
                                    break;
                                }
                            }
                        } else {
                            boolean found = false;
                            for (int o : honest) {
                                if (o == p.x) {
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                ok = false;
                            }
                        }
                        if (!ok) {
                            break loop;
                        }
                    }
                }
                if (ok) {
                    ans = Math.max(ans, honest.size());
                }
            }
            out.println(ans);
        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
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

    }
}

