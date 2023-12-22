import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(Math.max(Math.max(a + b, a - b), a * b));
    }
}