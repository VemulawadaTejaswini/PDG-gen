
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(in.nextLong());
        }
        for (int i = 0; i < m; i++) {
            long current = pq.poll();
            pq.add(-current/2);
        }
        long res = 0;
        while(!pq.isEmpty()) {
            res += pq.poll();
        }
        System.out.println(res);
    }
}
