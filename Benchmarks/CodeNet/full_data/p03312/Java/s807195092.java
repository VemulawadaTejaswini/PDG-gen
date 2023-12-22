import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static long[] pref;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt();
        long [] a = new long[n]; pref = new long[n + 1];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) pref[i] = pref[i - 1] + a[i - 1];
        // second cut
        long res = Long.MAX_VALUE;
        for (int i = 2; i <= n - 2; i++) {
            int lo = 1; int hi = i - 1;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (pref[mid] >= pref[i] / 2) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            if (lo > 1 && Math.abs(pref[i] - pref[lo - 1] - pref[lo - 1]) < Math.abs(pref[i] - pref[lo] - pref[lo])) lo--;
            ArrayList<Long> ret = new ArrayList<>();
            ret.add(pref[lo]); ret.add(pref[i] - pref[lo]);
            lo = i + 1; hi = n - 1;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (pref[mid] >= pref[i] + (pref[n] - pref[i]) / 2) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            if (lo > 1 && Math.abs(pref[lo - 1] - pref[i] - (pref[n] - pref[lo - 1])) < Math.abs(pref[lo] - pref[i] - (pref[n] - pref[lo]))) lo--;
            ret.add(pref[lo] - pref[i]); ret.add(pref[n] - pref[lo]);
            Collections.sort(ret);
            res = Math.min(res, ret.get(3) - ret.get(0));
        }
        out.println(res);
        out.close();
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