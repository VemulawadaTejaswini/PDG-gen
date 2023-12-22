import java.util.*;

public class Main {

    static long[][] cmemo = new long[2001][2001];
    private static long mod = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blue = sc.nextInt();
        int mod = 1000000007;

        int red = n-blue;
        //System.out.println(red + 1);
        for(int i = 1;i <= blue;i++){
            if(i > red + 1){
                System.out.println("0");
            }
            long ans = 0;
            int dr = red - i;
            int db = blue - i;
            ans += combi(db+i-1,db) * combi(dr+i-1, dr+1) % mod;
            if(dr >= 0){
                ans += combi(db+i-1,db) * combi(dr+i-1,dr) * 2 % mod;
            }
            if(dr >= 1){
                ans += combi(db+i-1,db) * combi(red-1,i) % mod;
            }
            System.out.println(ans);
        }
    }

    private static long combi(int n, int k){
        if(cmemo[n][k] == 0){
            long ans = 1;
            for(int i = 0;i < k;i++){
                ans = (ans * (n-i)) % mod;
            }
            long r = 1;
            for(int i = k;i > 0;i--){
                r = (r * i) % mod;
            }
            cmemo[n][k] = (ans * modinv(r, mod)) % mod;
        }
        return cmemo[n][k];
    }

    private static long modinv(long num, long mod){
        long result = 1;
        long n = mod - 2;
        BitSet bs = BitSet.valueOf(new long[]{n});
        for(int i = 0;i < bs.size();i++){
            if(bs.get(i)){
                result = result * num % mod;
            }
            num = num * num % mod;
        }
        return result;
    }
}

