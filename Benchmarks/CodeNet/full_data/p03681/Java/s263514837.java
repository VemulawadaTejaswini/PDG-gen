import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mo = 1000000007;
        long na = 1;
        long ma = 1;
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                na = na % mo * (n - i) % mo;
            }
            for (int i = 0; i < m; i++) {
                ma = ma % mo * (m - i) % mo;
            }
            if (m != n) {
                System.out.println(na % mo * ma % mo);
            } else {
                System.out.println(na % mo * ma % mo * 2 % mo);
            }
        }
    }
}