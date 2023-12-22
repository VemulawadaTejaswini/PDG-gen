
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] t;
    static int[] x;
    static int[] y;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<Point> points = new PriorityQueue<>(Comparator.comparingInt(x -> x.t));
        for (int i = 0; i < n; i++) {
            points.add(new Point(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
        Point c = new Point(0, 0, 0);
        while (!points.isEmpty()) {
            Point next = points.poll();
            int dis = Math.abs(c.x - next.x) + Math.abs(c.y - next.y);
            int time = next.t  -c.t;
            if (dis > time || Math.abs(dis - time) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static class Point {
        int t;
        int x;
        int y;

        public Point(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }
    }
}

