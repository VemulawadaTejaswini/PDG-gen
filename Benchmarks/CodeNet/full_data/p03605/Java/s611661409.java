import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println(n / 10 == 9 || n % 10 == 9 ? "Yes" : "No");
    }
}