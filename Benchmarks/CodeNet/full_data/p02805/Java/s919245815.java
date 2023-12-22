import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++){
            points[i] = new Point(sc.nextInt(),sc.nextInt());
        }
        double left = 0.d;
        double right = (double)(Math.sqrt(1000*1000 + 1000*1000) / 2);

        while (right - left > 1e-9) {
            double mid = (right + left) / 2;
            List<Point> intersects = new ArrayList<>();
            for (int i = 0; i < N-1; i++){
                for (int j = i+1; j < N; j++){
                    intersects.addAll(intersects(points[i],mid,points[j],mid));
                }
            }
            if (suffice(N,points, mid,intersects)){
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println(right);
    }

    private static boolean suffice(int N, Point[] points, double mid, List<Point> intersects) {
        for (Point p : intersects) {
            int count = 0;
            for (int i = 0; i < N; i++){
                if (p.dist(points[i]) < mid + 1e-9){
                    count++;
                }
            }
            if (count == N) {
                return true;
            }
        }
        return false;
    }
    private static List<Point> intersects(Point c1, double r1, Point c2, double r2){
        List<Point> list = new ArrayList<>();
        double dist = c1.dist(c2);

        double cm = (r1 * r1 - r2 * r2 + dist * dist) / dist / 2;
        Point m = c2.subtract(c1).scale(cm / dist).add(c1);
        double pm = Math.sqrt(r1 * r1 - cm * cm);
        Point mc = c1.subtract(m).scale(pm / cm);
        list.add(mc.rotate(Math.PI / 2).add(m));
        list.add(mc.rotate(-Math.PI / 2).add(m));
        return list;
    }

    public static class Point {
        public final double x;
        public final double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public Point scale(double s){
            return new Point(x * s, y * s);
        }

        public Point subtract(Point another){
            return new Point(x - another.x, y - another.y);
        }

        public Point add(Point another){
            return new Point(x + another.x, y + another.y);
        }

        public double dist(){
            return Math.sqrt(x * x + y * y);
        }

        public double distSq(Point another){
            return (another.x - x) * (another.x - x) + (another.y - y) * (another.y - y);
        }

        public double dist(Point another){
            return Math.sqrt(distSq(another));
        }

        public Point rotate(double theta){
            double newX = x * Math.cos(theta) - y * Math.sin(theta);
            double newY = x * Math.sin(theta) + y * Math.cos(theta);
            return new Point(newX, newY);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}