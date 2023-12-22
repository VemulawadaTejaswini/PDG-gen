import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        System.out.println(Math.abs(x - y) > 1 ? "Alice" : "Brown");
    }
}