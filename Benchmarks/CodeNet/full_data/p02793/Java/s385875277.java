import java.util.*;

public class Main{
    static int MOD = (int)1e9+7;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int[] clone = arr.clone();

        long ans = 0;

        long lcm = 1;

        int max = 0;
        for (int i=0; i<n; i++) max = Math.max(max, arr[i]);

        int[] div = new int[max+1];

        for (int i=0; i<n; i++){
            int tmp = arr[i];
            for (int j=2; j*j<=tmp; j++){
                int cnt = 0;
                while (tmp%j==0){
                    cnt++;
                    tmp /= j;
                }
                div[j] = Math.max(div[j], cnt);
            }
            if (tmp!=1) div[tmp] = Math.max(div[tmp], 1);
        }

        for (int i=2; i<=max; i++){
            lcm *= pow(i, div[i]);
            lcm %= MOD;
        }

        for (int i=0; i<n; i++){
            ans += lcm*pow(clone[i], MOD-2);
            ans %= MOD;
        }

        System.out.println(ans);

    }
    public static long pow(long m, long n){
        if (n==0) return 1;
        else if (n==1) return m;
        long x = pow(m, n/2);
        return n%2==0 ? x*x%MOD : x*(x*m%MOD)%MOD;
    }

    public static long lcm(long m, long n){
        return m*n/gcd(m, n);
    }
    public static long gcd(long m, long n){
        if (m<n) gcd(n, m);
        if (n==0) return m;
        return gcd(n, m%n);
    }
}