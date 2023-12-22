import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        long [][] odd = new long[n][2];
        long [] even = new long[n];
        for (long [] arr: odd) Arrays.fill(arr, Long.MIN_VALUE / 2);
        Arrays.fill(even, Long.MIN_VALUE / 2);
        odd[0][0] = 0; odd[0][1] = a[0];
        even[1] = Math.max(a[0], a[1]);
        if (n == 2) {
            out.println(even[1]);
        } else {
            odd[2][0] = Math.max(Math.max(a[0], a[1]), a[2]);
            odd[2][1] = a[0] + a[2];
            for (int i = 3; i < n; i++) {
                if (i % 2 == 1) {
                    even[i] = Math.max(even[i - 2] + a[i], odd[i - 3][1] + a[i - 1]);
                } else {
                    odd[i][1] = a[i] + odd[i - 2][1];
                    odd[i][0] = Math.max(a[i] + odd[i - 2][0], even[i - 3] + a[i - 1]);
                }
            }
            out.println(((n - 1) % 2 == 1) ? even[n - 1] : Math.max(odd[n - 1][0], odd[n - 1][1]));
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