import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (h <= a && w <= b) {
                count++;
            }
        }
        System.out.println(count);
    }
}