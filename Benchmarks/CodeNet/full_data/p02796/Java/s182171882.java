import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] array = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt() - 1;
            array[i] = new Point(x - l, x + l);
        }
        Arrays.sort(array, Comparator.comparingInt(k -> k.y));

        ArrayList<Point> list = new ArrayList<>();
        list.add(array[0]);

        parent: for (int i = 1; i < n; i++) {
            for (Point p: list
                 ) {
                if (array[i].x <= p.x && array[i].y >= p.x) {
                    continue parent;
                }
                if (p.x <= array[i].x && p.y >= array[i].x) {
                    continue parent;
                }
            }
            list.add(array[i]);
        }

        System.out.println(list.size());
    }
}