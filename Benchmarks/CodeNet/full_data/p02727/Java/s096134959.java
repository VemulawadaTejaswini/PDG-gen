import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        List<Long> p = new ArrayList<>();
        List<Long> q = new ArrayList<>();
        List<Long> r = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            p.add(scan.nextLong());
        }
        for (int i = 0; i < B; i++) {
            q.add(scan.nextLong());
        }
        for (int i = 0; i < C; i++) {
            r.add(scan.nextLong());
        }
        p.sort(Comparator.naturalOrder());
        q.sort(Comparator.naturalOrder());
        r.sort(Comparator.naturalOrder());
        long[] one = new long[X+1];
        long[] two = new long[Y+1];
        for (int i = A - X; i < A; i++) {
            one[i - (A - X)] = p.get(i);
        }
        one[X] = Long.MAX_VALUE;
        for (int i = B - Y; i < B; i++) {
            two[i - (B - Y)] = q.get(i);
        }
        two[Y] = Long.MAX_VALUE;
        int one_l = 0;
        int two_l = 0;
        for (long target : r) {
            if (one[one_l] <= two[two_l]) {
                if (target <= one[one_l]) {
                    continue;
                }
                one[one_l] = target;
                one_l += 1;
                continue;
            }
            if (target <= two[two_l]) {
                continue;
            }
            two[two_l] = target;
            two_l += 1;
            continue;
        }
        one[X] = 0;
        two[Y] = 0;
        long ans = Arrays.stream(one).sum() + Arrays.stream(two).sum();

        System.out.println(ans);
    }
}
