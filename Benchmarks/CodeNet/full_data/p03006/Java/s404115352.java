import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashSet<String> cache = new HashSet<>();
        List<Point> list = new ArrayList<Point>();
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.x = scan.nextInt();
            p.y = scan.nextInt();
            list.add(p);
            cache.add(p.x + ":" + p.y);
        }
        list.sort(new PointComparator());
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                Point p1 = list.get(i);
                Point p2 = list.get(j);
                int p = p2.x - p1.x;
                int q = p2.y - p1.y;
                int temp = 0;
                for (int k = 0; k < N; k++) {
                    Point current = list.get(k);
                    if (cache.contains((current.x - p) + ":" + (current.y - q))) {
                        continue;
                    }
                    temp += 1;
                }
                answer = Math.min(answer, temp);
            }
        }
        System.out.println(answer);


    }
    class Point {
        int x;
        int y;
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.y == o2.y) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o1.y, o2.y);
        }
    }
}