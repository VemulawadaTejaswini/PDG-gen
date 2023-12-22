import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            points[i] = new Point(x, y);
        }
        Point[] xSortedPoints = points.clone();
        Arrays.sort(xSortedPoints, (o1, o2) -> (int) (Math.signum(o1.x - o2.x)));
        Point[] ySortedPoints = points.clone();
        Arrays.sort(ySortedPoints, (o1, o2) -> (int) (Math.signum(o1.y - o2.y)));
        long minArea = (long) 2000000000 * 2000000000 + 1;
        for (int i = 0; i < N - K + 1; i++) {
            long xmax = -1000000001, ymax = -1000000001, xmin = 1000000001, ymin = 1000000001;
            for (int j = i; j < i + K; j++) {
                xmax = xmax > xSortedPoints[j].x ? xmax : xSortedPoints[j].x;
                ymax = ymax > xSortedPoints[j].y ? ymax : xSortedPoints[j].y;
                xmin = xmin < xSortedPoints[j].x ? xmin : xSortedPoints[j].x;
                ymin = ymin < xSortedPoints[j].y ? ymin : xSortedPoints[j].y;
            }
            long currentArea = (xmax - xmin) * (ymax - ymin);
            minArea = minArea < currentArea ? minArea : currentArea;
        }
        for (int i = 0; i < N - K + 1; i++) {
            long xmax = -1000000001, ymax = -1000000001, xmin = 1000000001, ymin = 1000000001;
            for (int j = i; j < i + K; j++) {
                xmax = xmax > ySortedPoints[j].x ? xmax : ySortedPoints[j].x;
                ymax = ymax > ySortedPoints[j].y ? ymax : ySortedPoints[j].y;
                xmin = xmin < ySortedPoints[j].x ? xmin : ySortedPoints[j].x;
                ymin = ymin < ySortedPoints[j].y ? ymin : ySortedPoints[j].y;
            }
            long currentArea = (xmax - xmin) * (ymax - ymin);
            minArea = minArea < currentArea ? minArea : currentArea;
        }
        System.out.println(minArea);
    }

    class Point {

        long x;
        long y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

}
