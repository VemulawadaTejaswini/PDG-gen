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
        List<Point> list = new ArrayList<Point>();
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.x = scan.nextLong();
            p.y = scan.nextLong();
            list.add(p);
        }
        list.sort(new PointComparator());
        int answer = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<> ();
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                Point p1 = list.get(i);
                Point p2 = list.get(j);
                long dx = p2.x - p1.x;
                long dy = p2.y - p1.y;
                String key = dx +":" + dy;
                if (!map.containsKey(key)) {
                    map.put(key, 0);
                }
                map.put(key, map.get(key)+1);
            }
        }
        int max = 0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        System.out.println(N - max);
    }
    class Point {
        long x;
        long y;
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.x == o2.x) {
                return Long.compare(o1.y, o2.y);
            }
            return Long.compare(o1.x, o2.x);
        }
    }
}