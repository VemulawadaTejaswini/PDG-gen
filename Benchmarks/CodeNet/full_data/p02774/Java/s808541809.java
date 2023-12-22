import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Long> queue = new PriorityQueue<>();
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] list = new long[N];
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            list[i] = num;
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                queue.offer(list[i]* list[j]);
            }
        }

        for (int i = 0; i < K - 1; i++) {
            queue.poll();
        }
        System.out.println(queue.peek());
    }
}