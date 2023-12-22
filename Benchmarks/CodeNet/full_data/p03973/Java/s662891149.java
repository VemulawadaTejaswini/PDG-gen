import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i= 0; i < n; i ++) {
            a[i] = sc.nextInt();
        }
        System.out.println(cal(n, a));
    }

    private static long cal(final int n, final int[] a) {
        long res = 0L;
        int maxP = 0;
        for (int i = 0; i < n; i ++) {
            if (maxP == 0) {
                res += a[i] - 1;
                maxP = 1;
            } else {
                int num = a[i] / (maxP + 1);
                if (a[i] == maxP + 1) {
                    maxP ++;
                } else if (a[i] % (maxP + 1) == 0) {
                    res += num -1;
                } else {
                    res += num;
                }
            }
        }
        return res;
    }
}
