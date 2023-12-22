import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int l = gcd(m, n);
        int ln = m / l;
        int lm = n / l;
        int ans = ln * n;
        int[] flag = new int[ans];
        char[] chars = new char[ans];

        for (int i = 0; i < s.length(); i++) {
            flag[i * ln] = 1;
            chars[i * ln] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            if (flag[i * lm] == 1) {
                if (chars[i*lm] != t.charAt(i)) {
                    ans = -1;
                }
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}