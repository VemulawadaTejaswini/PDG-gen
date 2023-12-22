import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long total = 1;
        int[] bases = new int[31];
        long[] values = new long[31];
        bases[0] = 1;
        values[0] = 2;
        for (int i = 1; i < 31; i++) {
            bases[i] = bases[i - 1] * 2;
            values[i] = values[i - 1] * values[i - 1] % MOD;
        }
        long ans = 1;
        int x = n;
        for (int i = 30; i >= 0; i--) {
            if (x >= bases[i]) {
                ans *= values[i];
                ans %= MOD;
                x -= bases[i];
            }
        }
		ans += MOD - getComb(n, a);
		ans += MOD - getComb(n, b);
		ans += MOD - 1;
		ans %= MOD;
		System.out.println(ans);
   }
   
   static long getComb(long n, long x) {
       long ans = 1;
       long base = 1;
       for (int i = 0; i < x; i++) {
           ans *= n - i;
           ans %= MOD;
           base *= x - i;
           base %= MOD;
       }
       long[] arr = new long[31];
       arr[0] = base;
       for (int i = 1; i < arr.length; i++) {
           arr[i] = arr[i - 1] * arr[i - 1];
           arr[i] %= MOD;
       }
       int target = MOD - 2;
       long alpha = 1;
       for (int i = 30; i >= 0; i--) {
           if (target >= (1 << i)) {
               alpha *= arr[i];
               alpha %= MOD;
               target -= (1 << i);
           }
       } 
       return ans * alpha % MOD;
   }
}
