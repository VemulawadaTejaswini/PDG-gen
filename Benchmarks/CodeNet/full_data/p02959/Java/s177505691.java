import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= b[i]) {
                ans += b[i];
            } else {
                ans += a[i];
                b[i] -= a[i];
                if (b[i] >= a[i+1]) {
                    ans += a[i+1];
                    a[i+1] = 0;
                } else {
                    a[i+1] -= b[i];
                    ans += b[i];
                }
            }
        }
        System.out.println(ans);
    }

}
