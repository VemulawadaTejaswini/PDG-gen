import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h][w];
        Queue<Point> que = new ArrayDeque<>();

        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int s = 0; s < w; s++) {
                if (line.charAt(s) == '#') {
                    que.add(new Point(s, i));
                    arr[i][s] = 1;
                }
            }
        }

        while (!que.isEmpty()) {
            Point p = que.poll();
            if (0 <= p.x - 1 && arr[p.y][p.x - 1] == 0) {
                arr[p.y][p.x - 1] = arr[p.y][p.x] + 1;
                que.add(new Point(p.y, p.x - 1));
            }
            if (p.x + 1 < w && arr[p.y][p.x + 1] == 0) {
                arr[p.y][p.x + 1] = arr[p.y][p.x] + 1;
                que.add(new Point(p.y, p.x + 1));
            }

            if (0 <= p.y - 1 && arr[p.y - 1][p.x] == 0) {
                arr[p.y - 1][p.x] = arr[p.y][p.x] + 1;
                que.add(new Point(p.y - 1, p.x));
            }
            if (p.y + 1 < w && arr[p.y + 1][p.x] == 0) {
                arr[p.y + 1][p.x] = arr[p.y][p.x] + 1;
                que.add(new Point(p.y + 1, p.x));
            }
        }

        int ans = 0;
        for (int[] a : arr) {
            for (int b : a) {
                ans = Math.max(ans, b);
            }
        }
        System.out.println(ans-1);
    }
}