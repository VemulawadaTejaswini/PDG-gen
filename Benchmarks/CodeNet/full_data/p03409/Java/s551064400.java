import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point> redList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            redList.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        ArrayList<Point> blueList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            blueList.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        sc.close();

        int ans = 0;

        redList.sort(Comparator.comparingInt(a -> a.y));
        blueList.sort(Comparator.comparingInt(a -> a.x));

        for (Point bp : blueList) {
            for (int i = redList.size() - 1; i >= 0; i--) {
                Point rp = redList.get(i);
                if (bp.x > rp.x && bp.y > rp.y) {
                    ans++;
                    redList.remove(rp);
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}