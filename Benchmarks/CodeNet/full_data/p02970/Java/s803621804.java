import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        d = d + d + 1;
        if (n%d==0) {
            System.out.println(n / d);
        } else {
            System.out.println(n / d + 1);
        }
    }
}
