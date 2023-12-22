import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int maxKey = 0;
        double maxVal = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (maxVal <= (double) a[i] / b[i]) {
                maxKey = i;
                maxVal = (double) a[i] / b[i];
            }
        }
        long ans = 0;
        while (h - a[maxKey] > 0) {
            h -= a[maxKey];
            ans += b[maxKey];
        }
        if (h <= 0) {
            System.out.println(ans);
            return;
        }
        int minKey = 0;
        int minVal = (int) Math.ceil((double) h / a[0]) * b[0];
        for (int i = 1; i < n; i++) {
            int v = (int) Math.ceil((double) h / a[i]) * b[i];
            if (v < minVal) {
                minKey = i;
                minVal = v;
            }
        }
        System.out.println(ans + b[minKey]);
    }

}
