import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        int ans = 0;
        int minV = 1000;
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            ans += s;
            if (s % 10 != 0) minV = Math.min(minV, s);
        }
        if (minV != 1000 && ans % 10 == 0) {
            ans -= minV;
        }
        if (ans % 10 == 0) System.out.println(0);
        else System.out.println(ans);
    }
}