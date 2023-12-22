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
        List<Point> list = new ArrayList<>();
        HashMap<Integer, Point> points = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Point p = new Point(i, scan.nextInt(), scan.nextInt());
            points.put(i, p);
            list.add(p);
        }
        List<Integer>[] edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        list.sort(new PointXComparator());
        for (int i = 0; i < N-1; i++) {
            Point from = list.get(i);
            Point to = list.get(i+1);
            edges[from.id].add(to.id);
            edges[to.id].add(from.id);
        }
        list.sort(new PointYComparator());
        for (int i = 0; i < N-1; i++) {
            Point from = list.get(i);
            Point to = list.get(i+1);
            edges[from.id].add(to.id);
            edges[to.id].add(from.id);
        }
        Set<Integer> used = new HashSet<>();
        long ans = 0;
        PriorityQueue<Path> queue = new PriorityQueue<>(new PathComparator());
        int from = 0;
        while(!points.isEmpty()) {
            Point current = points.remove(from);
            used.add(from);
            for (int i : edges[from]) {
                if (!points.containsKey(i)) {
                    continue;
                }
                queue.add(new Path(current, points.get(i)));
            }
            while(!queue.isEmpty()) {
                Path target = queue.poll();
                if (used.contains(target.from.id) && used.contains(target.to.id)) {
                    continue;
                }
                ans += target.distance;
                from = used.contains(target.from.id) ? target.to.id : target.from.id;
                break;
            }
        }
        System.out.println(ans);
    }
    class PointXComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.x != o2.x) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o1.y, o2.y);
        }
    }
    class PointYComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.y != o2.y) {
                return Integer.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.x, o2.x);
        }
    }
    class PathComparator implements Comparator<Path> {
        @Override
        public int compare(Path o1, Path o2) {
            if (o1.distance != o2.distance) {
                return Long.compare(o1.distance, o2.distance);
            }
            if (o1.from.id != o2.from.id){
                return Integer.compare(o1.from.id, o2.from.id);
            }
            return Integer.compare(o1.to.id, o2.to.id);
        }
    }
    class Path {
        long distance;
        Point from;
        Point to;
        Path(Point from, Point to) {
            this.from = from;
            this.to = to;
            this.distance = distance(from, to);
        }
        long distance(Point from, Point to) {
            return Math.min(Math.abs(from.x - to.x), Math.abs(from.y - to.y));
        }
    }
    class Point {
        int id;
        int x;
        int y;
        Point(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }
}
