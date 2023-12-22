import java.util.*;
 
public class Main {

    private static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+10];
        for (int i = 0; i < N; i++) {
            num[sc.nextInt()]++;
        }
        long ans = 1;
        int i = 1;
        while (num[i] > 0) {
            ans *= power(num[i-1], num[i]);
            ans %= MOD;
            i++;
        }
        System.out.println(ans);
    }

    private static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n%2 == 1) {
            return ((long)a*power(a, n-1))%MOD;
        }
        long half = power(a, n/2)%MOD;
        return (half*half)%MOD;
    }
}
