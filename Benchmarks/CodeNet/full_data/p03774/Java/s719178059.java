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
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        Point[] s = new Point[N];
        for (int i = 0; i < N; i++) {
            s[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Point[] c = new Point[M];
        for (int i = 0; i < M; i++) {
            c[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            Point curs = s[i];
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = 0; j < M; j++) {
                int d = curs.distanceTo(c[j]);
                if (min > d) {
                    min = d;
                    idx = j;
                }
            }
            ans[i] = idx;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(ans[i] + 1);
        }
        return;
    }

}