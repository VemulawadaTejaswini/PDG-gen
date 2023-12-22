import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int x = 1; x <= n; x++) {
            int y = n - x;
            if (y <= 0) continue;

            int tmpMin = sumDigits(x) + sumDigits(y);
            if (tmpMin < min) min = tmpMin;
        }

        System.out.println(min);
    }

    private static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }

        return sum;
    }
}
