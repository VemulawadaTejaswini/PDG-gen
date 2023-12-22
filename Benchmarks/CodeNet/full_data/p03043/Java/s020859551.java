import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();

        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int count = (int) Math.max(Math.ceil(Math.log10((double) k / i) / Math.log10(2)), 0);
            double val = Math.pow(0.5, count) / n;
            ans += val;
        }
        
        System.out.println(ans);
    }
}
