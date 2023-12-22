import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int ans(int n, int x, int[] a) {
        int cnt = 0;
        cnt += Math.max(0, a[0]-x); //First element
        int current = a[0]-cnt;
        for (int i = 1; i < n; i++) {
            int temp = cnt;
            cnt += Math.max(0, current+a[i]-x);
            current = a[i]-(cnt-temp);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = a[n-1-i];
        int ans = Math.min(ans(n, x, a), ans(n, x, b));


        System.out.println(ans);
    }
}
