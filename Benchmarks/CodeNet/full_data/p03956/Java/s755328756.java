import java.io.*;
import java.util.*;

public class Main {
    private static List<Point> list = new ArrayList<>();
    private static Map<Integer, List<Point>> map = new HashMap<>();
    private static int cnt;
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[M];
        int[] b = new int[M];
        for (int i = 0; i < M; ++i) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Point p = new Point(a[i], b[i]);
            list.add(p);
            List<Point> l1 = map.get(p.b);
            if (l1 == null) {
                l1 = new ArrayList<>();
                map.put(p.b, l1);
            }
            l1.add(p);
            if (p.a != p.b) {
                List<Point> l2 = map.get(p.a);
                if (l2 == null) {
                    l2 = new ArrayList<>();
                    map.put(p.b, l2);
                }
                l2.add(p);
            }
        }
        cnt = list.size();

        for (int i = 0; i < list.size(); ++i) {
            Point p1 = list.get(i);
            List<Point> l = map.get(p1.b);
            if (l != null) {
                for (int j = 0; j < l.size(); ++j) {
                    Point p2 = l.get(j);
                    paint(p1, p2);
                }
            }
        }

        System.out.println(cnt);
    }
    private static void paint(Point p1, Point p2) {
        if (board(p1.a, p1.b) && board(p2.a, p2.b) && !board(p2.b, p1.a)) {
            ++cnt;

            Point p3 = new Point(p2.b, p1.a);
            List<Point> l2 = map.get(p3.b);
            if (l2 == null) {
                l2 = new ArrayList<>();
                map.put(p3.b, l2);
            }
            l2.add(p3);
            list.add(p3);
        }
    }
    private static boolean board(int a, int b) {
        List<Point> l1 = map.get(a);
        if (l1 != null) {
            for (Point p : l1) {
                if (p.a == a && p.b == b) {
                    return true;
                }
            }
        }
        List<Point> l2 = map.get(b);
        if (l2 != null) {
            for (Point p : l2) {
                if (p.a == a && p.b == b) {
                    return true;
                }
            }
        }
        return false;
    }
    private static class Point {
        public int a;
        public int b;
        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public String toString() {
            return "(" + this.a + ", " + this.b + ")";
        }
    }
}