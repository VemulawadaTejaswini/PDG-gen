import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try  {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args){
        int N, K;
        FastReader sc = new FastReader();
        N = sc.nextInt(); K = sc.nextInt();
        String S = sc.nextLine();
        int L = 0, R = 0;
        boolean Lstate = false, Rstate = false;
        for (int i=0; i<N; i++){
            if (S.charAt(i) == 'L'){
                Rstate = false;
                if (!Lstate){
                    Lstate = true;
                } else {
                    L++;
                }
            } else if (S.charAt(i) == 'R'){
                Lstate = false;
                if (!Rstate){
                    Rstate = true;
                } else {
                    R++;
                }
            }
        }
        int ans = Math.min(L+R+2*K, N-1);
        System.out.printf("%d\n", ans);
    }
}
