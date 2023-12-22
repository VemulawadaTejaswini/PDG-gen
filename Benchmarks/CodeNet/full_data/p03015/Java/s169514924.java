import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        int MOD = 1000000000 + 7;

        FastScanner sc = new FastScanner();
        String L = sc.nextToken();
        int N = L.length();

        int dp1[] = new int[N];
        int dp2[] = new int[N];
        dp1[0] = 1;
        dp2[0] = 2;

        for (int i=1;i<N;i++) {
            if (L.charAt(i) == '1') {
                dp1[i] = dp1[i-1] * 3 + dp2[i-1];
                dp2[i] = dp2[i-1] * 2;
            } else {
                dp1[i] = dp1[i-1] * 3;
                dp2[i] = dp2[i-1];
            }

            dp1[i] %= MOD;
            dp2[i] %= MOD;
        }

        System.out.println((dp1[N-1] + dp2[N-1]) % MOD);
    }

    public static long nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (long) ret;
    }

    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}