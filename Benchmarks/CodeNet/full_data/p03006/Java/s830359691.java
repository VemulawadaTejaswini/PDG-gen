import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Ball[] balls = new Ball[n];

        for (int i = 0; i < n; i++) {
            balls[i] = new Ball(scanner.nextInt(), scanner.nextInt());
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int dx = balls[i].x - balls[j].x;
                    int dy = balls[i].y - balls[j].y;

                    int current = 0;
                    for (int k = 0; k < n; k++) {
                        int res = 1;
                        for (int l = 0; l < n; l++) {
                            if (balls[k].x - balls[l].x == dx && balls[k].y - balls[l].y == dy) {
                                res = 0;
                                break;
                            }
                        }
                        current += res;
                    }
                    result = Math.min(result, current);
                }
            }
        }

        System.out.println(result);
    }

    static class Ball {

        public Ball(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }
}
