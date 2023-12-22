import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();

        List<PriorityQueue<Integer>> queues = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            queues.add(new PriorityQueue<>(n, Collections.reverseOrder()));
        }

        for (int i = 0; i < n; i++) {
            int x = std.nextInt();
            int y = std.nextInt();
            int z = std.nextInt();

            int t1 = x + y + z;
            queues.get(0).add(t1);

            int t2 = -x + y + z;
            queues.get(1).add(t2);

            int t3 = x - y + z;
            queues.get(2).add(t3);

            int t4 = x + y - z;
            queues.get(3).add(t4);

            int t5 = x - y - z;
            queues.get(4).add(t5);

            int t6 = -x -y -z;
            queues.get(5).add(t6);

            int t7 = -x -y +z;
            queues.get(6).add(t7);

            int t8 = -x +y -z;
            queues.get(7).add(t8);
        }

        long max = 0;
        for (int i = 0; i < 8; i++) {
            int total = 0;
            PriorityQueue<Integer> queue = queues.get(i);
            for (int j = 0; j < m; j++) {
                int val = queue.poll();
                total += val;
            }

            max = Math.max(max, total);
        }

        System.out.println(max);
    }
}