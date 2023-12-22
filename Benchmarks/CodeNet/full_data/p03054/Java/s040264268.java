import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;
    static final String YES = "YES";
    static final String NO = "NO";

    static long H;
    static long W;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        H = sc.nextLong();
        W = sc.nextLong();
        long N;
        N = sc.nextLong();
        long s_r;
        s_r = sc.nextLong();
        long s_c;
        s_c = sc.nextLong();
        String S;
        S = sc.next();
        String T;
        T = sc.next();
        solve(H, W, N, s_r, s_c, S, T);
    }

    static void solve(long H, long W, long N, long s_r, long s_c, String S, String T){
        long[] koma = new long[]{s_r, s_c};
        boolean go_l;
        boolean go_r;
        boolean go_u;
        boolean go_d;

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        for (int i = 0; i < N; i++) {
            koma = takahashi(koma, s[i]);
            check(koma);
            koma = aoki(koma, t[i]);
            check(koma);
        }
        System.out.println("YES");

    }

    static void check(long[] koma) {
        if(koma[0] < 1) System.out.println("NO");
        if(koma[0] > H) System.out.println("NO");
        if(koma[1] < 1) System.out.println("NO");
        if(koma[1] > W) System.out.println("NO");
        
    }

    static long[] takahashi(long[] koma, char sign) {
        boolean go_l = koma[1] - 1 <= W - koma[1];
        boolean go_r = koma[1] - 1 >= W - koma[1];
        boolean go_u = koma[0] - 1 <= H - koma[0];
        boolean go_d = koma[0] - 1 >= H - koma[0];


        switch (sign) {
            case 'L':
                if(go_l) return move(koma, sign); 
                else return koma;
            case 'R':
                if(go_r) return move(koma, sign); 
                else return koma;
            case 'U':
                if(go_u) return move(koma, sign); 
                else return koma;
            case 'D':
                if(go_d) return move(koma, sign); 
                else return koma;
        }
        return null;
    }

    static long[] aoki(long[] koma, char sign) {
        boolean go_l = koma[1] - 1 > W - koma[1];
        boolean go_r = koma[1] - 1 < W - koma[1];
        boolean go_u = koma[0] - 1 > H - koma[0];
        boolean go_d = koma[0] - 1 < H - koma[0];

        switch (sign) {
            case 'L':
                if(go_l) return move(koma, sign); 
                else return koma;
            case 'R':
                if(go_r) return move(koma, sign); 
                else return koma;
            case 'U':
                if(go_u) return move(koma, sign); 
                else return koma;
            case 'D':
                if(go_d) return move(koma, sign); 
                else return koma;
        }
        return null;
    }

    static long[] move (long[] koma, char sign) {
        switch (sign) {
            case 'L':
                koma[1]--;
                return koma;
            case 'R':
                koma[1]++;
                return koma;
            case 'U':
                koma[0]--;
                return koma;
            case 'D':
                koma[0]++;
                return koma;
        }
        return null;
    }


    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
