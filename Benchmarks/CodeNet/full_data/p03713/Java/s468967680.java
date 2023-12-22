import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        sc.close();
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        long ans = Integer.MAX_VALUE;
        if (w == 2 && h == 2) {
            System.out.println(1);
            return;
        }
        if (w == 2) {
            System.out.println(h);
            return;
        }
        if (h == 2) {
            System.out.println(w);
            return;
        }
        long mid = w / 2;
        for (int i = 1; i < h; i++) {

            long height = h - i;
            long[] areas = new long[3];
            areas[0] = i * w;
            areas[1] = mid * height;
            if (w % 2 == 0) {
                areas[2] = mid * height;
            } else {
                areas[2] = (mid + 1) * height;
            }

            Arrays.sort(areas);
            if (areas[0] < 0)
                continue;
            long sa = areas[2] - areas[0];
            ans = Math.min(ans, sa);
        }
        mid = h / 2;
        for (int i = 1; i < w; i++) {

            long width = w - i;
            long[] areas = new long[3];
            areas[0] = i * h;
            areas[1] = mid * width;
            if (h % 2 == 0) {
                areas[2] = mid * width;
            } else {
                areas[2] = (mid + 1) * width;
            }

            Arrays.sort(areas);
            if (areas[0] < 0)
                continue;
            long sa = areas[2] - areas[0];
            ans = Math.min(ans, sa);
        }
        System.out.println(ans);
    }
}