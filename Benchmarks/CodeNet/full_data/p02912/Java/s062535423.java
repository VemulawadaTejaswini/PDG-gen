import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Mutiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            q.offer(a);
        }

        for (int i = 0; i < m; i++) {
            int a = q.poll();
            q.offer(a/2);
        }

        long res = 0;
        while (!q.isEmpty()) {
            res += (long)q.poll();
        }
        System.out.println(res);
    }
}
