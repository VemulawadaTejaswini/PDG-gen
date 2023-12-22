import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        if (set.size() > 2) {
            out.println("No");
        } else if (set.size() == 1) {
            out.println((a[0] == n - 1 || a[0] <= n / 2) ? "Yes" : "No");
        } else {
            int [] b = new int[2]; int j = 0;
            for (Integer i: set) b[j++] = i;
            Arrays.sort(b);
            if (b[0] + 1 != b[1]) {
                out.println("No");
            } else {
                int distinct = 0;
                for (int i = 0; i < n; i++) if (a[i] == b[0]) distinct++;
                int lo = distinct + 1; int hi = distinct + (n - distinct) / 2;
                if (b[1] >= lo && b[1] <= hi) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
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