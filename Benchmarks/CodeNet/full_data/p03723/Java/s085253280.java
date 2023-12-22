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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int ans = 0;
        Set<String> cache = new HashSet<>();
        while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
            if (cache.contains(A + "_" + B + "_" + C)) {
                System.out.println(-1);
                return;
            }
            cache.add(A + "_" + B + "_" + C);
            Queue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());
            queue.add(A / 2 + B / 2);
            queue.add(B / 2 + C / 2);
            queue.add(C / 2 + A / 2);
            A = queue.poll();
            B = queue.poll();
            C = queue.poll();
            ans += 1;
        }
        System.out.println(ans);
    }
}
