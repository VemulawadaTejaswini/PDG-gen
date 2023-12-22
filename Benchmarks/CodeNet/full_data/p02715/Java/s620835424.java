import java.util.*;

public class Main {

    static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        memo = new int[k+1];

        long res = 0;
        long[] num = new long[k+1];
        for(int i=k; i>=1; i--) {
            long a = b(k / i, n);
            for(int b = 2; i * b <= k; b++) {
                a += mod - num[i * b];
                a %= mod;
            }
            num[i] = a;
            res += num[i] * i;
            res %= mod;
        }

        System.out.println(res);
    }

    static int[] memo;

    static int b(int a, int b) {
        if(memo[a] > 0) return memo[a];
        long res = 1;
        for(int i=0; i<b; i++) {
            res *= a;
            res %= mod;
        }
        return memo[a] = (int)res;
    }


}