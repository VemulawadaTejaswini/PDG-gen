import java.util.*;

public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long[] zero = new long[62];
        long[] one = new long[62];
        for (int i = 0; i < n; i++) {
            long num = array[i];
            for (int j = 0; j < 62; j++) {
                long tmp = num % 2;
                if (num == 0 || tmp == 0) {
                    zero[j]++;
                } else {
                    one[j]++;
                }
                
                num /= 2;
            }
        }
        
        long ans = 0;
        long two = 1;
        for (int i = 0; i < 62; i++) {
            long tmp = zero[i] * one[i];
            tmp %= MOD;
            
            tmp *= two;
            tmp %= MOD;
            
            ans += tmp;
            ans %= MOD;
            
            two *= 2;
        }
        System.out.println(ans);
    }
}