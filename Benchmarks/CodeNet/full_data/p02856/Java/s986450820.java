import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int m = std.nextInt();
        long sum = 0;
        long baseCount = 0;
        long liftCount = 0;
        for (int i = 0; i < m; i++) {
            int d = std.nextInt();
            int c = std.nextInt();
            baseCount += c;
            sum += d *c;
            long lift = sum / 10;
            liftCount += lift;
            sum = sum % 10;
        }
        long ans = baseCount - 1 + liftCount;
        System.out.println(ans);

    }
}
