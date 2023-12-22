
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        scanner.nextLine();
        final HashSet<Integer> points = new HashSet<>();

        for (int i = 0; i < h; i++) {
            final String str = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                if (str.charAt(j) == '#') {
                    points.add(10000 * i + j);
                }
            }
        }

        int counter = 0;
        while (points.size() != h * w) {
            final HashSet<Integer> points1 = new HashSet<>();
            for (final int point : points) {
                final int hh = point/10000;
                final int ww = point%10000;
                add(points1, hh - 1, ww, h, w);
                add(points1, hh + 1, ww, h, w);
                add(points1, hh, ww + 1, h, w);
                add(points1, hh, ww - 1, h, w);
            }
            points.addAll(points1);
            counter++;
        }

        System.out.println(counter);
    }

    private static void add(final Set<Integer> pointSet, final int h, final int w, final int hh, final int ww) {
        if (h >= 0 && h < hh && w >= 0 && w < ww) {
            pointSet.add(10000 * h + w);
        }
    }
}
