//package atcoder.beginner144;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        long K = in.nextLong();
        long sum = 0;
        Long[] A = new Long[N], F = new Long[N];
        for(int i = 0; i < N; i++) {
            A[i] = in.nextLong();
            sum += A[i];
        }
        for(int i = 0; i < N; i++) {
            F[i] = in.nextLong();
        }

        if(sum <= K) {
            out.println(0);
        }
        else {
            Arrays.sort(A);
            Arrays.sort(F);
            long l = 0, r = 0;
            for(int i = 0; i < N; i++) {
                r = Math.max(r, A[i] * F[N - 1 - i]);
            }
            while(l < r - 1) {
                long mid = l + (r - l) / 2;
                if(check(A, F, K, mid)) {
                    r = mid;
                }
                else {
                    l = mid + 1;
                }
            }
            if(check(A, F, K, l)) {
                out.println(l);
            }
            else {
                out.println(r);
            }
        }

        out.close();

//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static boolean check(Long[] A, Long[] F, long K, long target) {
        long sum = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] * F[A.length - 1 - i] > target) {
                sum += (A[i] - target / F[A.length - 1 - i]);
            }
        }
        return sum <= K;
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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


