import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> a = new ArrayList<>();
        List<Point> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        for (int i = 0; i < n; i++) {
            c.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        a.sort(Comparator.comparingInt(d -> -((Point)d).y).thenComparing(d -> ((Point)d).x));
        c.sort(Comparator.comparingInt(d -> ((Point)d).x).thenComparing(d -> ((Point)d).y));

        int sum = 0;
        for (int i = 0; i < c.size(); i++) {
            Point r = c.get(i);
            Point l = null;
            for(int j = 0;j < a.size();j++) {
                Point tmp = a.get(j);
                if( tmp.x < r.x && tmp.y < r.y) {
                    l = tmp;
                    a.remove(l);
                    break;
                }
            }
            if(l != null) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    static class Point{
        int x;
        int y;
        Point(int x, int y) {
            this.y = y;
            this.x = x;
        }
    }
}
