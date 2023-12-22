import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    String s;
    int x, y;
    int len;
    int[] dx = { 0, 1, 0, -1 };
    int[] dy = { 1, 0, -1, 0 };

    private void solve() {
        s = sc.next();
        x = sc.nextInt();
        y = sc.nextInt();
        len = s.length();
        if (rec(0, 0, 1, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    boolean rec(int nx, int ny, int d, int idx) {
        if (idx == len) {
            if (nx == x && ny == y) {
                return true;
            } else {
                return false;
            }
        }

        if (s.charAt(idx) == 'F') {
            return rec(nx + dx[d], ny + dy[d], d, idx + 1);
        } else {
            int tl = turnLeft(d);
            int tr = turnRight(d);
            return rec(nx, ny, tl, idx + 1) || rec(nx, ny, tr, idx + 1);
        }
    }

    int turnLeft(int d) {
        if (d == 0) {
            return 3;
        }
        return d - 1;
    }

    int turnRight(int d) {
        if (d == 3) {
            return 0;
        }
        return d + 1;
    }

}
