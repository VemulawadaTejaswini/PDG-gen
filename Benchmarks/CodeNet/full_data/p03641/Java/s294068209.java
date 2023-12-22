import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n;
    int[] ps;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        ps = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        List<Integer> ans = dfs(0, ps.length);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    List<Integer> dfs(int l, int r) {
       // System.out.println(l + " " + r);
        if (r == l) {
            return new ArrayList<>();
        }
        if (r - l == 2) {
            List<Integer> ret = new ArrayList<>();
            ret.add(ps[l]);
            ret.add(ps[l + 1]);
            return ret;
        }
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        int minOddIndex = -1;
        int minEvenIndex = -1;
        for (int i = l; i < r; i++) {
            if (((l + i) & 1) == 0 && ps[i] < minEven) {
                minEven = ps[i];
                minEvenIndex = i;
            }
        }
        for (int i = minEvenIndex; i < r; i++) {
            if (((l + i) & 1) == 1 && ps[i] < minOdd) {
                minOdd = ps[i];
                minOddIndex = i;
            }
        }
        List<Integer> minPair = new ArrayList<>();
        minPair.add(minEven);
        minPair.add(minOdd);
        List<Integer> ret = merge(dfs(l, minEvenIndex),
                merge(dfs(minEvenIndex + 1, minOddIndex),
                        dfs(minOddIndex + 1, r)));
        /*
        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i));
            if (i < ret.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        */
        minPair.addAll(ret);
        return minPair;
    }

    List<Integer> merge(List<Integer> a, List<Integer> b) {
        //System.out.println(a.toString());
        //System.out.println(b.toString());
        List<Integer> ret = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.size() || j < b.size()) {
            if (i == a.size()) {
                ret.add(b.get(j++));
                ret.add(b.get(j++));
            } else if (j == b.size()) {
                ret.add(a.get(i++));
                ret.add(a.get(i++));
            } else {
                if (a.get(i) < b.get(j)) {
                    ret.add(a.get(i++));
                    ret.add(a.get(i++));
                } else {
                    ret.add(b.get(j++));
                    ret.add(b.get(j++));
                }
            }
        }
        return ret;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}