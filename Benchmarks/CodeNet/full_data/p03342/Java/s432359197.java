import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();

        int xor[] = new int[N+1];
        int sum[] = new int[N+1];

        for (int i=0;i<N;i++) {
            int A = sc.nextInt();

            xor[i+1] = xor[i] ^ A;
            sum[i+1] = sum[i] + A;
        }

        int ans = 0;
        for (int i=0;i<=N;i++) {
            for (int j=i+1;j<=N;j++) {
                if ((xor[j] ^ xor[i]) == (sum[j] - sum[i])) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
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