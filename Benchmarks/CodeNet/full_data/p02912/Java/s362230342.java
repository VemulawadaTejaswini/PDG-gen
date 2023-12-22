import java.util.*;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>(N, Comparator.comparing(Long::longValue).reversed());
        for (int i = 0; i < N; i++) {
            queue.add(s.nextLong());
        }

        int tmpM = M;
        while (queue.size() > 0 && tmpM > 0) {
            Long p = queue.poll();
            long newP = p / 2;
            if (newP > 0) queue.add(newP);
            tmpM--;
        }

        long totalPrice = StreamSupport.stream(queue.spliterator(), true).mapToLong(Long::longValue).sum();
        System.out.println(totalPrice);
     }
}