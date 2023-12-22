import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int s = scanner.nextInt();
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i <= s; i *= 10) {
            diff = Math.min(diff, Math.abs(753 - s / i % 1000));
        }
        System.out.println(diff);
    }
}