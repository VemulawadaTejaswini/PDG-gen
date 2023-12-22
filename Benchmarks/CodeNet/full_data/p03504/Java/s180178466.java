import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        DRecording solver = new DRecording();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRecording {
        static DRecording.Subset[] subsets;

        static int find(int i) {
            if (subsets[i].parent != i)
                subsets[i].parent = find(subsets[i].parent);
            return subsets[i].parent;
        }

        static void union(int x, int y) {
            int xroot = find(x);
            int yroot = find(y);

            if (subsets[xroot].rank < subsets[yroot].rank)
                subsets[xroot].parent = yroot;
            else if (subsets[yroot].rank < subsets[xroot].rank)
                subsets[yroot].parent = xroot;
            else {
                subsets[xroot].parent = yroot;
                subsets[yroot].rank++;
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            BitSet[] rep = new BitSet[c];
            for (int i = 0; i < c; i++) {
                rep[i] = new BitSet(100001);
            }
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int ch = sc.nextInt() - 1;
                rep[ch].set(s, t + 1);
            }
            subsets = new DRecording.Subset[c];
            for (int i = 0; i < c; i++) {
                subsets[i] = new DRecording.Subset();
                subsets[i].parent = i;
                subsets[i].rank = 0;
                subsets[i].b = rep[i];
            }
            for (int i = 0; i < c; i++) {
                for (int j = i + 1; j < c; j++) {
                    int g1 = find(i);
                    int g2 = find(j);
                    if (g1 != g2) {
                        BitSet tmp = new BitSet(100001);
                        tmp.or(subsets[g1].b);
                        tmp.and(subsets[g2].b);
                        if (tmp.cardinality() == 0) {
                            union(i, j);
                            int g = find(i);
                            BitSet r = new BitSet(100001);
                            r.or(subsets[g1].b);
                            r.or(subsets[g2].b);
                            subsets[g].b = r;
                        }
                    }
                }
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < c; i++) {

                map.put(find(i), 1);
            }
            out.println(map.size());
        }

        static class Subset {
            int parent;
            int rank;
            BitSet b;

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

