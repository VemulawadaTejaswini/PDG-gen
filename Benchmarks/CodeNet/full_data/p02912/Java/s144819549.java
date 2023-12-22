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
        int M = scan.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            queue.add(scan.nextLong());
        }
        int count = 0;
        while (count < M) {
            long x = queue.poll();
            x /= 2;
            queue.add(x);
            count += 1;
        }
        long answer = 0;
        while (!queue.isEmpty()) {
            answer += queue.poll();
        }
        System.out.println(answer);
    }
}
