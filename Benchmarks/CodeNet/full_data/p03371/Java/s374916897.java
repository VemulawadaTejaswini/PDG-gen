import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long sum = 0;

        if ((a + b) > (c * 2)) {
            long cbuy = Math.min(x, y);
            sum = sum + ((c * 2) * cbuy);
            x = x - cbuy;
            y = y - cbuy;
        }

        if (a > (c * 2)) {
            long cbuy = x;
            sum = sum + ((c * 2) * cbuy);
            x = x - cbuy;
        }

        if (b > (c * 2)) {
            long cbuy = y;
            sum = sum + ((c * 2) * cbuy);
            y = y - cbuy;
        }

        sum = sum + (a * x);
        sum = sum + (b * y);

        System.out.println(sum);
    }
}