import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            max = Math.max(max, a);
        }
        System.out.println(Math.abs(k - max - max) - 1);
    }
}