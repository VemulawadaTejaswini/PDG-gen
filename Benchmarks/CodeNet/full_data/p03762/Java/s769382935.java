import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        long xtotal = 0;
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            xtotal += (i * x) % mod - ((n-i-1) * x) % mod;
            xtotal %= mod;
        }
        long ytotal = 0;
        for(int i = 0; i < m; i++){
            long y = sc.nextLong();
            ytotal += (i * y) % mod - ((m-i-1) * y) % mod;
            ytotal %= mod;
        }
        System.out.println(Math.abs((xtotal*ytotal))%mod);
    }
}
