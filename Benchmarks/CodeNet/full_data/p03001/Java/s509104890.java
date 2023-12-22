import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int w = scanner.nextInt();
        final int h = scanner.nextInt();
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();

        final double max = w / 2.0 * h;
        final int multi = x == w / 2.0 && y == h / 2.0 ? 1 : 0;

        System.out.println(max + " " + multi);
    }
}