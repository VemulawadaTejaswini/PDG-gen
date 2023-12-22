
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] students = new Point[n];
        for (int i=0; i<n; ++i) {
            students[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Point[] checks = new Point[m];
        for (int i=0; i<m; ++i) {
            checks[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        for (Point student : students) {
            System.out.println(solve(student, checks));
        }
    }

    private int solve(Point student, Point[] checks) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i=0; i<checks.length; ++i) {
            Point check = checks[i];
            int dist = Math.abs(student.x - check.x) + Math.abs(student.y - check.y);
            if (min > dist) {
                min = dist;
                index = i;
            }
        }
        return index+1;
    }

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
