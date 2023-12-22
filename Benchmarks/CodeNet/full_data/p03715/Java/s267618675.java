import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);
    void solve() {
        long H = sc.nextInt();
        long W = sc.nextInt();
        if (H % 3 == 0 || W % 3 == 0) {
            System.out.println(0);
            return;
        }

        long res = Long.MAX_VALUE;
        for (int w = 1; w < W; w++) {
            long a = w * H;
            long b = (H / 2) * (W - w);
            long c = (H - (H / 2)) * (W - w);
            long max = Math.max(a, Math.max(b, c));
            long min = Math.min(a, Math.min(b, c));
            res = Math.min(res, max - min);
        }

        for (int h = 1; h < H; h++) {
            long a = h * H;
            long b = (W / 2) * (H - h);
            long c = (W - (W / 2)) * (H - h);
            long max = Math.max(a, Math.max(b, c));
            long min = Math.min(a, Math.min(b, c));
            res = Math.min(res, max - min);
        }

        System.out.println(res);
    }
}