import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int m = std.nextInt();
//        BigDecimal sum = BigDecimal.ZERO;
        long sum = 0;
        long baseCount = 0;
        long liftCount = 0;
        for (int i = 0; i < m; i++) {
            int d = std.nextInt();
            long c = std.nextLong();
            baseCount += c;
            sum += d * c - 1;
            long lift = sum / 9;
            sum = sum % 9;
            liftCount += lift;
        }
        long ans = baseCount - 1 + liftCount;
        System.out.println(ans);

    }
}
