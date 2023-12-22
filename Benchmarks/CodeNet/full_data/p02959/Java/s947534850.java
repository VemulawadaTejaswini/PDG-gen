import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int m = a[0] + a[1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] >= m) {
                sum += m;
                try {
                    m = a[i + 2];
                } catch (Exception e) {

                }
            } else {
                sum += b[i];
                try {
                    if (b[i] > a[i])
                        m = m - b[i] + a[i + 2];
                    else
                        m = m - a[i] + a[i + 2];
                } catch (Exception e) {

                }
            }
        }
        System.out.println(sum);
    }
}