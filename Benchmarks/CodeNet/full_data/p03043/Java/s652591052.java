import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        Double d = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) break;
            int t = 0;
            while (true) {
                if (i * (Math.pow(2, ++t)) >= k) {
                    d += (1.0 / n) * Math.pow(0.5, t);
                    break;
                }
            }
        }
        System.out.print(d);
    }
}