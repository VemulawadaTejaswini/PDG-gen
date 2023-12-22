
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int w = scanner.nextInt();
        final int h = scanner.nextInt();
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();

        final double vertical = Math.min(x * h, (w - x) * h);
        final double horizontal = Math.min(w * y, w * (h - y));
        final double half = w == x || x == 0 || h == y || y == 0 ? w * h / 2.0 : 0.0;

        System.out.println(Math.max(Math.max(vertical, horizontal), half) + " " + (vertical == 0 || horizontal == 0 ? "0" : "1"));
    }
}