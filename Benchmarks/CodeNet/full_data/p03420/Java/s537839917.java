import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), k = in.nextLong();
        if(k == 0) {
            System.out.println(n * n);
            return;
        }
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += (n / i) * Math.max(0, (i - k));
            ans += Math.max(0, (n % i) - k + 1);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
