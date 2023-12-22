import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static long gcd(long ai, long aj) {
        if (aj == 0)
            return ai;
        else
            return gcd(aj, ai % aj);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            int top = pq.poll();
            pq.add(top / 2);
        }

        for (int i = 0; i < N; i++) {
            sum += pq.poll();
        }

        System.out.println(sum);
    }
}
