import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            x -= m;
            min = Math.min(min, m);
        }
        System.out.println(n + x / min);
    }
}