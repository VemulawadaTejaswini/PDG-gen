import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        int b = std.nextInt();
        int c = std.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(3);
        pq.add(a);
        pq.add(b);
        pq.add(c);

        pq.poll();
        int center = pq.poll();
        if (center == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}