import java.util.*;

public class Main {

    static long[][] cmemo = new long[2001][2001];
    private static long mod = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blue = sc.nextInt();

        int red = n-blue;
        for(int i = 1;i <= blue;i++){
            long ans = 0;
            if(i == 1 && red == 0){
                System.out.println(1);
                continue;
            }
            ans += combination(blue-1,i-1) * combination(red-1,i-2) % mod;
            ans += combination(blue-1,i-1) * combination(red-1,i-1) * 2 % mod;
            ans += combination(blue-1,i-1) * combination(red-1,i) % mod;
            System.out.println(ans % mod);
        }
    }

    private static long combination(int n, int k){
        if(n < 0){
            return 0;
        }
        if(k < 0 || n < k){
            return 0;
        }
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

