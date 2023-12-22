import java.io.*;
import java.util.*;

public class TaskA {
    //FastIO io = new FastIO("in.txt");
    int N, M;
    long[][] dp;
    static long MOD = 1000000007;
    static long[] FS = new long[1005];

    void init(){
        FS[0] = 1;
        for(int i=1; i<1005; i++){
            FS[i] = (FS[i-1] * i) % MOD;
        }
    }

    long solve(){
        init();
        dp = new long[N][N+1];
        for(int i=0; i<N; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<N; i++){
            for(int k=1; k<=N; k++) {
                int j = i - M;
                if (j >= 0) {
                    dp[i][k] += dp[i-1][k-1] * 2;
                    if(k - 2 >= 0){
                        dp[i][k] += dp[i-1][k-2];
                    }
                }
            }
        }

        long ans = FS[N], f = -1;
        for(int k=1; k<=N; k++){
            ans += f * dp[N-1][k] * FS[N - k];
            f = f * -1;
            ans %= MOD;
        }
        return ans;
    }

    public void main() throws Exception {
        N = io.nextInt(); M = io.nextInt();
        io.out(solve() + "\n");

    }

    public static void main(String[] args) throws Exception {
        TaskA task = new TaskA();
        task.main();
    }

    class FastIO {
        BufferedReader br;
        StringTokenizer sk;

        public FastIO(String fname){
            try{
                File f = new File(fname);
                if(f.exists()) {
                    System.setIn(new FileInputStream(fname));
                }

            }catch (Exception e){
                throw new IllegalArgumentException(e);
            }

            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastIO(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(sk==null || !sk.hasMoreElements()){
                try {
                    sk = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new IllegalArgumentException(e);
                }
            }
            return sk.nextToken();
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public char nextChar(){
            return next().charAt(0);
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }

        public void out(String v){
            System.out.print(v);
        }

        public void out(int v) {
            System.out.print(v);
        }

        public void out(long v){
            System.out.print(v);
        }

        public void out(double v) {
            System.out.print(v);
        }
    }
}

