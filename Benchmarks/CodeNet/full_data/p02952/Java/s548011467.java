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
        int N = sc.nextInt();
        int valLen = String.valueOf(N).length();
        int ans = 0;
        for(int i = 1;i<= N;i++){
            if(String.valueOf(i).length()%2==1){
                ans++;
            }
        }
        System.out.println(ans);
    }

        int gcd
        (int m, int n
        
            ) {
        if (m < n) {
                return gcd(n, m);
            }
            if (n == 0) {
                return m;
            }
            return gcd(n, m % n);
        }
    }