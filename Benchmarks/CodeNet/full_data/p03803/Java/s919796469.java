import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 1) a = 14;
        if (b == 1) b = 14;

        System.out.println(a == b ? "Draw" : a > b ? "Alice" : "Bob");
    }
}