import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Point[] list = new Point[N];
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.t = scan.nextInt();
            p.x = scan.nextInt();
            p.y = scan.nextInt();
            list[i] = p;
        }
        Point prev = new Point();
        prev.t = 0;
        prev.x = 0;
        prev.y = 0;
        boolean answer = true;
        for (int i = 0; i < N; i++) {
            Point current = list[i];
            int time = current.t - prev.t;
            int distance = prev.distance(current);

            if (time == distance) {
                prev = current;
                continue;
            }
            if (time < distance || ((time - distance) % 2 != 0)) {
                answer = false;
                break;
            }
            prev = current;
        }
        System.out.println(answer ? "Yes" : "No");
    }
    class Point {
        int t;
        int x;
        int y;
        int distance(Point t) {
            return Math.abs(this.x - t.x) + Math.abs(this.y - t.y);
        }
    }
}
