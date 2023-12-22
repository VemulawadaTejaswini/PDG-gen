import java.util.Scanner;

public class Main {

    private static long dividableNum(long n, long x) {
        if (n == -1) {
            return 0;
        }
        return n / x + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long count = 0;
        count = dividableNum(b, x) - dividableNum(a - 1, x);
        System.out.println(count);
    }

}
