import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n == 2)
            ans = Math.max(a[0], a[1]);
        else {
            int[] array = new int[n];
            array[n-1] = a[n-1];
            for (int i = n-2; i > 0; i--) {
                array[i] = EuclideanAlgorithm(a[i], array[i+1]);
            }

            array[0] = a[0];
            ans = array[1];
            for (int i = 1; i < n; i++) {
                array[i] = EuclideanAlgorithm(a[i], a[i-1]);
                int tmp = i+1 < n ? array[i+1] : a[n-1];
                tmp = EuclideanAlgorithm(tmp, array[i-1]);
                ans = Math.max(ans, tmp);
            }
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
