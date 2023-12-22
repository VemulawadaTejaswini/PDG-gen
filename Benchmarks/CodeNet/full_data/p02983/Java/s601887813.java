import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long ans = INF;
        if((R-L)>2019){
            System.out.println("0");
            return;
        }
        for (long i = L; i <= R; i++) {
            for(long j = i+1;j<=R;j++){
                ans = Math.min(ans,(i*j)%2019);
                if(ans == 0){
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
