import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        double ans = 0;
        for (int i = 0; i < n; i++) {
            double value = std.nextDouble();
            String unit = std.next();
            if (unit.equals("BTC")) {
                double btcRate = 380000.0;
                ans += value * btcRate;
            } else if (unit.equals("JPY")) {
                ans += value;
            }
        }

        System.out.println(ans);
    }
}
