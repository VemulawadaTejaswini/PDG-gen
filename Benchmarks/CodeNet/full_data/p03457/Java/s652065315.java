import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceTo(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class Solver {

    private boolean reachable(int difft, int d) {
        int diff = difft - d;
        if (diff < 0)  return false;
        if ((diff % 2) == 0) return true;
        return false;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N];
        Point[] p = new Point[N];


        int sum = 0;
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
            p[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int curt = 0;
        Point curp = new Point(0, 0);
        for (int i = 0; i < N; i++) {
            int nxtt = t[i];
            Point dst = p[i];
            int d = curp.distanceTo(dst);
            if (!reachable(nxtt - curt, d)) {
                System.out.println("No");
                return;
            }
            curt = nxtt;
            curp = dst;
        }

        System.out.println("Yes");
        return;
    }

}