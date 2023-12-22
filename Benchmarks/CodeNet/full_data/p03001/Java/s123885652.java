
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final long w = scanner.nextLong();
        final long h = scanner.nextLong();
        final long x = scanner.nextLong();
        final long y = scanner.nextLong();

        final long vertical = Math.min(x * h, (w - x) * h);
        final long horizontal = Math.min(w * y, w * (h - y));

        System.out.println(Math.max(vertical, horizontal) + " " + (vertical == 0 || horizontal == 0 ? "0" : "1"));
    }
}