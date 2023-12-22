import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int j = digitSum(i);
            if (a <= j && j <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static int digitSum(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}