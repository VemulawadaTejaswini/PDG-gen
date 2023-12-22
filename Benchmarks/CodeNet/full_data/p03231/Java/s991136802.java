import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        boolean bre = false;
        int yaku = 1;
        if (s.charAt(0) != t.charAt(0)) {
            bre = true;
        } else {
            for (int i = 2; i <= Math.min(n, m); i++) {
                if (n % i == 0 && m % i == 0) {
                    yaku = i;
                }
            }
            if (yaku != 1) {
                int a = n / yaku;
                int b = m / yaku;
                for (int i = 1; a * i < n && b * i < m; i++) {
                    if (s.charAt(a * i) != t.charAt(b * i)) {
                        bre = true;
                        break;
                    }
                }
            }
        }
        if (bre) {
            System.out.println(-1);
        } else {
            System.out.println(n * m / yaku);
        }
    }
}