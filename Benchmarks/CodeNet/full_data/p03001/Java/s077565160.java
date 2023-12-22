import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int i = Math.min(x, w - x) * h;
        int j = Math.min(y, h - y) * w;
        System.out.println(Math.max(i, j) + " " + (i == j ? 1 : 0));
    }
}