import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println(a == b && b == c ? -1 : Math.min(Math.min(Integer.numberOfTrailingZeros(Math.abs(a - b)), Integer.numberOfTrailingZeros(Math.abs(b - c))), Integer.numberOfTrailingZeros(Math.abs(c - a))));
    }
}