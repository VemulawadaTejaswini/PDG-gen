import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Queue<Long> queue = new ArrayDeque<>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        queue.add(4L);
        queue.add(5L);
        queue.add(6L);
        queue.add(7L);
        queue.add(8L);
        queue.add(9L);
        Long x = 0L;
        for (int i = 0; i < K; i++) {
            x = queue.poll();
            if (x % 10 != 0) {
                queue.add(10 * x + x % 10 - 1);
            }
            queue.add(10 * x + x % 10);
            if (x % 10 != 9) {
                queue.add(10 * x + x % 10 + 1);
            }
        }
        System.out.println(x);
    }
}
