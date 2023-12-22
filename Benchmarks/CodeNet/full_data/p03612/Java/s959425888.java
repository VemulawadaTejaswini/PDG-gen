import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int c = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
            if (p[i] == i + 1) {
                c++;
            } else if (c <= 1) {
                ans += c;
            } else {
                ans += c - 1;
                c = 0;
            }
        }
        if (c <= 1) {
            ans += c;
        } else {
            ans += c - 1;
            c = 0;
        }
        System.out.println(ans);
    }
}
