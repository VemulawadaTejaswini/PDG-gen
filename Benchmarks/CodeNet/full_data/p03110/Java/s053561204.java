package abc119.B;

import java.util.*;

public class Main {
    static final double ratio = 380000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for (int n = 0; n < N; n += 1) {
            double x = sc.nextDouble();
            String u = sc.next();
            if (u.equals("BTC")) {
                sum += (long) x * ratio;
            } else {
                sum += (long) x;
            }
        }
        System.out.println(sum);
    }
}
