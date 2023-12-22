import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){       
        ModOp.init();
        int H, W, A, B; {int[] a = in.ii(); H = a[0]; W = a[1]; A = a[2]; B = a[3];}
        long ans = 0;
        final int c1 = B-1, c2 = H+W-B-2, c3 = W-B-1;
        for(int i = H-A-1; i > -1; i--){
            ans = (ans + ModOp.com(i+c1, c1) * ModOp.com(c2-i, c3)) % ModOp.MOD;
        }
        out.println(ans);
    }

    static class ModOp {
        final static long MOD = 1_000_000_007;
        final static int MAX = 200_000;
        static long[] fact;
        static long[] factInv;
        static long[] inv;

        static long pow(long a, long b){
            long ret = 1;
            while(b > 0){
                if(b%2 == 1){
                    ret = ret*a%MOD;
                }
                a = a*a%MOD;
                b /= 2;
            }
            return ret;
        }

        static long mul(int s, int e){
            long ret = 1;
            for(int i = s; i <= e; i++){
                ret = ret*i%MOD;
            }
            return ret;
        }

        static long fact(int n){
            return mul(1, n);
        }

        static long nCr(int n, int r){
            return mul(n-r+1, n) * pow(fact(r), MOD-2) % MOD;
        }

        static void init() {
            fact = new long[MAX+1];
            factInv = new long[MAX+1];
            inv = new long[MAX+1];
            fact[0] = fact[1] = factInv[0] = factInv[1] = inv[1] = 1;
            for (int i = 2; i <= MAX; i++){
                fact[i] = fact[i - 1] * i % MOD;
                inv[i] = MOD - inv[(int)(MOD%i)] * (MOD / i) % MOD;
                factInv[i] = factInv[i - 1] * inv[i] % MOD;
            }
        }

        static long com(int n, int k){
            return n < k || n < 0 || k < 0 ? 0 : 
                   fact[n] * (factInv[k] * factInv[n - k] % MOD) % MOD;
        }

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
