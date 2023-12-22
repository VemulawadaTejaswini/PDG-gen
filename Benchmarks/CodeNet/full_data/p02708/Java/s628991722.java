import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        int mod = 1000000007;
        long ans = 0;

        for(long i=k; i<=n+1;i++) {
            long min = sum(i-1);
            long max = sum(n) - sum(n-i);
            long sa = max - min;
            sa++;
            ans = (ans + sa);
        }
        ans = ans % mod;
        System.out.println(ans);
    }
    public static long sum(long n) {
        long ans = n*(n+1)/2;
        //累積和
        return ans;
    }
}
