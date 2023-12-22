import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        int min = Integer.MAX_VALUE;
        for (int p = 1; p < Math.sqrt(n) + 1; p++) {
            if (n % p == 0) {
                long q = n / p;

                int f = Math.max(digits(p), digits(q));
                min = Math.min(min, f);
            }
        }

        System.out.println(min);
    }

    static int digits(long n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
