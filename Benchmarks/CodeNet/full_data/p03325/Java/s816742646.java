import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(n, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int val = std.nextInt();
            queue.add(val);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (v % 2 == 0) {
                int nv = v / 2;
                queue.add(nv);
                count++;
            }
        }

        System.out.println(count);
    }
}
