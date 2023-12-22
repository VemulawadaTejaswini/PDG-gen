import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);
    static int MOD = 1000000007;
    static long[] fac;
    static long[] finv;
    static long[] inv;
    static int N, K;    
    public static void main(String[] args){

        {int[] a = in.ii(); N = a[0]; K = a[1];}
        int[] A = in.ii();
        long ans = 0;

        fac = new long[N];
        finv = new long[N];
        inv = new long[N];

        COMinit();
        Arrays.sort(A);
        for(int i = 1; i <= N-K+1; i++){
            ans = (ans + (A[N-i]-A[i-1])*COM(N-i, K-1)) % MOD;
        }
        out.println(ans);
        out.flush();
    }

    static void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < N; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    static long COM(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return times(fac[n], finv[k], finv[n - k]);
    }
    
    static long times(long... a){
        long ret = 1;
        for(int i = 0; i < a.length; i++){
            ret = ret*a[i]%MOD;
        }
        return ret;
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
