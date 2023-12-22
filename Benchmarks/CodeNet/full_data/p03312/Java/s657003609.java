import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static long[] pref;
    static long split;
    static long res;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt();
        long [] a = new long[n]; pref = new long[n + 1];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) pref[i] = pref[i - 1] + a[i - 1];
        split = pref[n] / 4;
        res = Long.MAX_VALUE;
        dfs(0, new ArrayList<>(), 1);
        out.println(res);
        out.close();
    }

    static void dfs(int cur, ArrayList<Long> dif, int element) {
        if (element == 5) {
            Collections.sort(dif);
            res = Math.min(res, dif.get(dif.size() - 1) - dif.get(0));
        } else if (element == 4) {
            dif.add(pref[n] - pref[cur]);
            dfs(n, dif, element + 1);
        } else {
            int lo = cur + 1; int hi = n - 4 + element;
            long here = pref[cur];
            // above
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (pref[mid] >= here + split) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            ArrayList<Long> above = new ArrayList<>(dif);
            above.add(pref[lo] - here);
            dfs(lo, above, element + 1);
            lo = cur + 1; hi = n - 4 + element; int ct = 0;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (mid == lo) ct++;
                if (ct == 2) break;
                if (pref[mid] < here + split) {
                    lo = mid;
                } else {
                    hi = mid - 1;
                }
            }
            if (lo + 1 <= n && pref[lo + 1] < here + split) lo++;
            ArrayList<Long> below = new ArrayList<>(dif);
            below.add(pref[lo] - here);
            dfs(lo, below, element + 1);
        }

    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
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