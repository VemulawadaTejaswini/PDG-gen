import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println(n % 1000 % 111 == 0 || n / 10 % 111 == 0 ? "Yes" : "No");
    }
}