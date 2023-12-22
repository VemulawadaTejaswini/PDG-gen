import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long k = sc.nextLong();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        ArrayList<Integer> starts = new ArrayList<>();
        //HashSet<Integer> seen = new HashSet<>();
        int [] dp = new int[n];
        int [] next = new int[n];
        Arrays.fill(next, n);
        int [] b = new int[n + 1];
        Arrays.fill(b, -1);
        for (int i = 0; i < n; i++) {
            if (b[a[i]] != -1) next[b[a[i]]] = i;
            b[a[i]] = i;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (next[i] == n) dp[i] = i;
            else if (next[i] == n - 1) dp[i] = -1;
            else dp[i] = dp[next[i] + 1];
        }
        int [] first = new int[n + 1];
        Arrays.fill(first, -1);
        for (int i = 0; i < n; i++) {
            if (first[a[i]] == -1) first[a[i]] = i;
        }
        int cur = 0; starts.add(-1);
        while (cur != -1) {
            int newStart = dp[cur];
            if (newStart != -1) starts.add(newStart);
            if (newStart == -1) {
                cur = -1;
            } else {
                cur = first[a[newStart]] + 1;
                if (cur == n) cur = -1;
            }
        }
        long rem = k % starts.size();
        int start = starts.get((int) rem);
        if (start == -1) {
            out.println();
        } else {
            ArrayList<Integer> res = new ArrayList<>();
            int i = start;
            while (i < n) {
                if (dp[i] == i) res.add(a[i++]);
                else {
                    int go = dp[i];
                    if (go != -1) i = go; else break;
                }
            }
            for (Integer x: res) out.print(x + " ");
        }
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