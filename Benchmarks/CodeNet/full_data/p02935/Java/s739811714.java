import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(std.nextInt());
        }

        Integer first = pq.poll();
        double ans = first;
        while (!pq.isEmpty()) {
            Integer value = pq.poll();
            ans += value;
            ans /= 2.0;
        }

        System.out.println(ans);
    }
}
