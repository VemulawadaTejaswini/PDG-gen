import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x = sc.nextLong();
        long ans = 0;

        if (a + b > x) {
            System.out.println(ans);
            return;
        }

        long n = Math.min(x / a, 1000000000);
        while (true) {
            long nedan = a * n + b * getDigit(n);
            System.out.println("n: "+n+"nedan: "+nedan);
            if (nedan <= x) {
                ans = n;
                break;
            }
            n--;
        }
        System.out.println(ans);
    }

    private static int getDigit(long num) {
        int digit = 0;
        while (num != 0) {
            num /= 10;
            digit++;
        }
        return digit;
    }
}
