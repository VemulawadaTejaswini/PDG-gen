import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int b1 = 0;
        int b2 = w;
        int b3 = 0;
        int b4 = h;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();
            if (a == 1) {
                b1 = Math.max(b1, x);
            } else if (a == 2) {
                b2 = Math.min(b2, x);
            } else if (a == 3) {
                b3 = Math.max(b3, y);
            } else {
                b4 = Math.min(b4, y);
            }
        }
        System.out.println(Math.max(0, b4 - b3) * Math.max(0, b2 - b1));
    }
}