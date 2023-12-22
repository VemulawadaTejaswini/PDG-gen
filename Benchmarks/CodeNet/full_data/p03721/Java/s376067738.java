import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc61 c
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Point> queue = new PriorityQueue<>((Comparator.comparingInt(a -> a.x)));

        for (int i = 0; i < n; i++) {
            queue.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        long count = 0;
        for (Point p: queue
             ) {
            count += p.y;
            if (count >= k) {
                System.out.println(p.x);
                return;
            }
        }
    }
}