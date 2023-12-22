import java.io.*;
import java.util.*;

public class Main {
    private static List<Point> list = new ArrayList<>();
    private static Map<Integer, List<Point>> map = new HashMap<>();
    private static boolean[][] board;
    private static int cnt;
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        board = new boolean[N + 1][N + 1];

        int[] a = new int[M];
        int[] b = new int[M];
        for (int i = 0; i < M; ++i) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            board[a[i]][b[i]] = true;
            Point p = new Point(a[i], b[i]);
            list.add(p);
            List<Point> l = map.get(b[i]);
            if (l == null) {
                l = new ArrayList<>();
                map.put(a[i], l);
            }
            l.add(p);
        }
        cnt = list.size();

        for (int i = 0; i < list.size(); ++i) {
            Point p1 = list.get(i);
            List<Point> l = map.get(p1.b);
            if (l != null) {
                for (Point p2 : l) {
                    paint(p1, p2);
                }
            }
        }

        System.out.println(cnt);
    }
    private static void paint(Point p1, Point p2) {
        if (board[p1.a][p1.b] && board[p2.a][p2.b] && !board[p2.b][p1.a]) {
            board[p2.b][p1.a] = true;
            ++cnt;

            List<Point> l2 = map.get(p2.b);
            if (l2 == null) {
                l2 = new ArrayList<>();
                map.put(p2.b, l2);
            }
            Point p3 = new Point(p2.b, p1.a);
            l2.add(p3);
            list.add(p3);
        }
    }
    private static class Point {
        public int a;
        public int b;
        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}