import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = EuclideanAlgorithm(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            ans = EuclideanAlgorithm(ans, a[i]);
        }

        System.out.println(ans);
    }

    public static int EuclideanAlgorithm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int re = max % min;
        if (re == 0)
            return min;
        return EuclideanAlgorithm(min, re);
    }
}
