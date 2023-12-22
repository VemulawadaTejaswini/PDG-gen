import java.util.PriorityQueue;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>(n);

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        while (q.size() > 1) {
            int smallest = q.poll();
            int nextSmallest = q.poll();

            if (nextSmallest % smallest != 0)
                q.add(nextSmallest % smallest);

            q.add(smallest);
        }

        System.out.println(q.poll());
    }
}