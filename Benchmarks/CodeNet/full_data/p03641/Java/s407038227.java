import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    static SegmentTree stEven, stOdd;
    static int n, arr[], pos[];

    static ArrayList<Integer> solve (int l, int r, int p) {
        if (r < 0 || l >= n || l > r) return new ArrayList<>();
        int min1 = p == 0 ? stEven.query(l, r) : stOdd.query(l, r), minPos1 = pos[min1];
        int min2 = p == 0 ? stOdd.query(minPos1 + 1, r) : stEven.query(minPos1 + 1, r), minPos2 = pos[min2];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(min1);
        res.add(min2);
        ArrayList<Integer> f[] = new ArrayList[] {solve(l, minPos1 - 1, p), solve(minPos1 + 1, minPos2 - 1, 1 - p), solve(minPos2 + 1, r, p)};
        int idx[] = new int[3];
        while (true) {
            boolean allFinished = true;
            for (int i = 0; i < 3; i++) allFinished &= idx[i] == f[i].size();
            if (allFinished) break;

            Triple[] triples = new Triple[3];
            for (int i = 0; i < 3; i++) {
                if (idx[i] == f[i].size()) triples[i] = new Triple(Integer.MAX_VALUE, Integer.MAX_VALUE, i);
                else triples[i] = new Triple(f[i].get(idx[i]), f[i].get(idx[i] + 1), i);
            }
            Arrays.sort(triples);
            Triple best = triples[0];
            idx[best.idx] += 2;
            res.add(best.first);
            res.add(best.second);
        }
        return res;
    }
    static class Triple implements Comparable<Triple>{
        int first, second, idx;
        Triple (int f, int s, int i) {
            first = f;
            second = s;
            idx = i;
        }

        @Override
        public int compareTo(Triple triple) {
            return first != triple.first ? Integer.compare(first, triple.first) : Integer.compare(second, triple.second);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        arr = new int[n];
        pos = new int[(int)1e5 * 2 + 3];
        int[] even = new int[n], odd = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pos[arr[i]] = i;
            if (i % 2 == 0) {
                even[i] = arr[i];
                odd[i] = Integer.MAX_VALUE;
            } else {
                odd[i] = arr[i];
                even[i] = Integer.MAX_VALUE;
            }
        }
        stEven = new SegmentTree(even);
        stOdd = new SegmentTree(odd);

        ArrayList<Integer> res = solve(0, n - 1, 0);
        for (int i = 0; i < res.size(); i++) {
            if (i > 0) out.print(" ");
            out.print(res.get(i));
        }
        out.println();
        out.close();
    }





    static class SegmentTree {
        int[] a;
        int n;
        int[] t;

        SegmentTree(int[] aa) {
            a = aa.clone();
            n = a.length;
            t = new int[n << 1 << 1];
            Arrays.fill(t, Integer.MAX_VALUE);
            build(1, 0, n - 1);
        }

        void build(int node, int s, int e) {
            if (s == e) t[node] = a[s];
            else {
                int mid = (s + e) >> 1;
                build(node << 1, s, mid);
                build(node << 1 | 1, mid + 1, e);
                t[node] = Math.min(t[node << 1], t[node << 1 | 1]);
            }
        }

        int query(int s, int e) {
            return query(1, 0, n - 1, s, e);
        }

        int query(int node, int s, int e, int l, int r) {
            if (s >= l && e <= r) return t[node];
            if (s > r || e < l) return Integer.MAX_VALUE;
            int mid = (s + e) >> 1;
            return Math.min(query(node << 1, s, mid, l, r), query(node << 1 | 1, mid + 1, e, l, r));
        }

    }
































    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
            }
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}