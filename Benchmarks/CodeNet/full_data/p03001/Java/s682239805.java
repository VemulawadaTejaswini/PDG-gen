import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int w = std.nextInt();
        int h = std.nextInt();
        int x = std.nextInt();
        int y = std.nextInt();

        if (w / 2 == x && h / 2 == y) {
            double sq = w * h / 2.0;
            System.out.println(sq + " 1");
        } else {
            double xSq = Math.min ((w - x) * h, x * h);
            double ySq = Math.min(w * (h - y), w * h);
            System.out.println(Math.max(xSq, ySq) + " 0");
        }
    }
}
