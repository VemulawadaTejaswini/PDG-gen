import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] list = new Point[m];

        for (int i = 0; i < m; i++) {
            list[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(list, Comparator.comparingInt(p -> p.y));

        int ans = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            Point p = list[i];
            if (p.x < index && p.y >= index) {
                continue;
            }
            index = p.y;
            ans++;
        }

        System.out.println(ans);
    }
}