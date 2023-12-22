import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumDigits(i);
            if (a <= sum && sum <= b) res += i;
        }

        System.out.println(res);
    }

    private static int sumDigits(int num) {
        int sum = 0;// 10進数の各桁の和
        while (num > 0) {
            sum = sum + (num % 10);
            num /= 10;
        }

        return sum;
    }
}
