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
        int N = scan.nextInt();
        long K = scan.nextLong();
        List<Long> A = new ArrayList<>();
        List<Long> F = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextLong());
        }
        for (int i = 0; i < N; i++) {
            F.add(scan.nextLong());
        }
        A.sort(Comparator.naturalOrder());
        F.sort(Comparator.reverseOrder());
        long r = 0;
        for (int i = 0; i < N; i++) {
            r += A.get(i) * F.get(i);
        }
        long l = -1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            long count = 0;
            for (int i = 0; i < N; i++) {
                count += Math.max(A.get(i) - m / F.get(i), 0);
            }
            if (count <= K) {
                r = m;
            } else {
                l = m;
            }
        }
        System.out.println(r);
    }
}
