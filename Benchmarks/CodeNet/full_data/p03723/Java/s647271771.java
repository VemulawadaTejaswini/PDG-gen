import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);
    long hash(long[] cs) {
        return cs[0] ^ 185769L + cs[1] ^ 123456L + cs[2] ^ 95472L;
    }
    void solve() {
        long[] cs = new long[3];
        for (int i = 0; i < 3; i++) cs[i] = sc.nextInt();
        long ans = 0;
        Set<Long> set = new HashSet<Long>();
        do {
            boolean check = false;
            for (int i = 0; i < 3; i++) if (cs[i] % 2 == 1) check = true;
            if (check) break;
            long newA = cs[1] / 2 + cs[2] / 2;
            long newB = cs[0] / 2 + cs[2] / 2;
            long newC = cs[0] / 2 + cs[1] / 2;
            cs[0] = newA; cs[1] = newB; cs[2] = newC;
            ans++;
            long hash = hash(cs);
            if (set.contains(hash)) {
                System.out.println(-1);
                return;
            }
            set.add(hash);
        } while(true);
        System.out.println(ans);
    }
}