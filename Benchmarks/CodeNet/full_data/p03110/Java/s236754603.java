package abc119.B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        for (int n = 0; n < N; n += 1) {
            double x = sc.nextDouble();
            String u = sc.next();
            if (u.equals("BTC")) {
                sum += x * 380000.0;
            } else {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
