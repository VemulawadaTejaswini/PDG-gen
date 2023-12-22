import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n], y = new int[n], h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        ArrayList<Point> kouho = new ArrayList<>();
        for (int xx = 0; xx <= 100; xx++) {
            for (int yy = 0; yy <= 100; yy++) {
                kouho.add(new Point(xx, yy));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (h[i] == 0) continue;
                if (h[j] == 0) continue;

                ArrayList<Point> kouho2 = new ArrayList<>();

                for (Point p : kouho) {
                    if (h[i] - h[j] == (-Math.abs(x[i] - p.x) - Math.abs(y[i] - p.y)) - (-Math.abs(x[j] - p.x) - Math.abs(y[j] - p.y))) {
                        kouho2.add(p);
                    }
                }

                kouho = kouho2;
            }
        }

        int centerX = kouho.get(0).x, centerY = kouho.get(0).y;

        for (int j = 0; j < n; j++) {
            if (h[j] == 0) continue;
            System.out.println(centerX + " " + centerY + " " + (h[j] + Math.abs(x[j] - centerX) + Math.abs(y[j] - centerY)));
            return;
        }

        System.out.println(centerX + " " + centerY + " " + 1);
    }
}