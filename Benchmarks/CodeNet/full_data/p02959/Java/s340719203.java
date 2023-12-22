import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            sum += b;
            a[i] -= b;
            if (a[i] < 0) {
                a[i + 1] += a[i];
            }
            if (a[i + 1] < 0) {
                sum += a[i + 1];
                a[i + 1] = 0;
            }
        }

        System.out.println(sum);
    }
}