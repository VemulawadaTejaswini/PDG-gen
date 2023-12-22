import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (n <= sum) {
                for (int j = i; j > 0; j--) {
                    if (n >= j) {
                        System.out.println(j);
                        n -= j;
                    }
                }
                return;
            }
        }
    }
}