import java.util.Scanner;

/**
 * Created by Manabu on 8/16/19.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, A, B;

        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        //helper(0, A, B, C, X);

        int result = 0;

        for (int i = 1; i <= N; i++) {
            int sum = digitSum(i);
            if (sum >= A && sum <= B) {
                result += i;
            }
        }

        System.out.println(result);
    }

    private static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }
}