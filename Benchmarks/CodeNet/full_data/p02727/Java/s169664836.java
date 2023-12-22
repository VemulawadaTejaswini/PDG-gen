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
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < A; i++) {
            q1.add(scan.nextInt());
        }
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < B; i++) {
            q2.add(scan.nextInt());
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < X; i++) {
            queue.add(q1.poll());
        }
        for (int i = 0; i < Y; i++) {
            queue.add(q2.poll());
        }
        for (int i = 0; i < C; i++) {
            queue.add(scan.nextInt());
        }
        long ans = 0;
        for (int i = 0; i < X + Y; i++) {
            ans += queue.poll();
        }
        System.out.println(ans);
    }
}
