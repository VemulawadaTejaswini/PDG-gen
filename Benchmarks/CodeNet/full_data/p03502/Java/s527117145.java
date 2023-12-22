import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i *= 10) {
            sum += n % (i * 10) / i;
        }
        System.out.println(n % sum == 0 ? "Yes" : "No");
    }
}