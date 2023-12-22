import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 100000;
        int a[] = new int[N];
        for (int i = 0; N > i; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 1; N > j; j++) {
            int x = 0;
            int y = 0;
            for (int k = 0; N > k; k++) {
                if (j > k) {
                    x += a[k];
                } else {
                    y += a[k];
                }
            }
                if (ans > Math.abs(x - y)) {
                    ans = Math.abs(x - y);
                }
        }
        System.out.println(ans);
    }
}