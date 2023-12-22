import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
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
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> divs = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (long j = 1; j * j <= tab[i]; j++) {
                    if (tab[i] % j == 0) {
                        divs.putIfAbsent((int) j, 0);
                        divs.put((int) j, divs.get((int) j) + 1);
                        if (tab[i] / j != j) {
                            divs.putIfAbsent((int) (tab[i] / j), 0);
                            divs.put((int) (tab[i] / j), divs.get((int) (tab[i] / j)) + 1);
                        }
                    }
                }
            }
            Iterator<Map.Entry<Integer, Integer>> it = divs.entrySet().iterator();
            Map.Entry<Integer, Integer> t;
            ArrayList<Integer> poss = new ArrayList<>();
            while (it.hasNext()) {
                t = it.next();
                if (t.getValue() == n - 1 || t.getValue() == n) {
                    poss.add(t.getKey());
                }
            }
            int ans = 0;
            for (int i = 0; i < poss.size(); i++) {
                ans = Math.max(ans, poss.get(i));
            }
            out.println(ans);
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

