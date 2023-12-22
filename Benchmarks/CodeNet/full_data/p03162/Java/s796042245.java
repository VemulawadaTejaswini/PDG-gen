import java.awt.*;
import java.util.*;

public class Main {

    private static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int n = sc.nextInt();

        Hikaku.compare();

        Point lastSelected = Hikaku.array[0];
        Point lastNotSelected = Hikaku.array[1];

        int sum = 0;

        for (int i = 1; i < n; i++) {
            Hikaku.compare();
            // Maxの種類が被っている
            if (lastSelected.x == Hikaku.array[0].x) {
                // 前回Max+今回2ndと前回2ndと今回Maxを比較する
                if (lastSelected.y + Hikaku.array[1].y >= lastNotSelected.y + Hikaku.array[0].y) {
                    sum += lastSelected.y;
                    lastSelected = Hikaku.array[1];
                    lastNotSelected = Hikaku.array[0];
                } else {
                    sum += lastNotSelected.y;
                    lastSelected = Hikaku.array[0];
                    lastNotSelected = Hikaku.array[1];
                }
            } else {
                sum += lastSelected.y;
                lastSelected = Hikaku.array[0];
                lastNotSelected = Hikaku.array[1];
            }
        }

        System.out.println(sum + lastSelected.y);
    }

    private static class Hikaku {
        private static Point[] array;
        private static void compare() {
            array = new Point[3];
            for (int i = 0; i < 3 ; i++) {
                array[i] = new Point(i, sc.nextInt());
            }
            Arrays.sort(array, (a, b) -> b.y - a.y);
        }
    }
}