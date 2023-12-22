import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        if ((w / 2.0) == x && (h / 2.0) == y) {
            System.out.println(w * y + " 1");
        } else if ((w / 2.0) == x) {
            System.out.println(x * h + " 0");
        } else if ((h / 2.0) == y) {
            System.out.println(y * w + " 0");
        } else {
            int xx = Math.min(x, w - x);
            int yy = Math.min(y, h - y);
            if (xx * h == yy * w) {
                System.out.println(xx * h + " 1");
            } else {
                System.out.println(Math.max(xx * h, yy * w) + " 0");
            }
        }
    }
}