import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            sum = sumDigits(i);
            if (a <= sum && sum <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }

    public static int sumDigits(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}