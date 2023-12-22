import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextInt() - 2, a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a == b ? 1 : n == -1 || a > b ? 0 : n * (b - a) + 1);
    }
}