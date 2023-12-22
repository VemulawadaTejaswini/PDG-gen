
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Point> redSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            redSet.add(new Point2(a,b));
        }

        Set<Point> blueSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            blueSet.add(new Point(a,b));
        }

        int ans = 0;
        for (Point blue: blueSet) {
            for (Point red: redSet) {
                if (red.isGood(blue)) {
                    ans++;
                    redSet.remove(red);
                    break;
                }
            }
        }
       System.out.println(ans);

        sc.close();
    }


    static class Point implements Comparable<Point> {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isGood(Point o) {
            return ((x < o.x) && (y < o.y));
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

        @Override
        public int compareTo(Point o) {
            return x - o.x;
        }
    }

    static class Point2 extends Point {
        Point2(int x, int y) {
            super(x, y);
        }
        @Override
        public int compareTo(Point o) {
            return o.y - y;
        }
    }

    static void printTime(String str){
        long now = System.currentTimeMillis();
        System.out.println(String.format("[%tH:%tM:%tS:%tL]%s", now, now, now, now, str));
    }
}
