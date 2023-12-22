import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC154D - Dice in Line

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int[n];
        int[] p3 = new int[n];

        int max = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j < k; j++) {
                p3[i] += p[i + j];
            }
            if (max < p3[i]) {
                max = p3[i];
                idx = i;
//                System.out.println("->max=" + max);
//                System.out.println("->idx=" + idx);
            }
        }

        double[] e = new double[k];
        double ans = 0;

        // 期待値
        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= p[idx + i]; j++) {
                e[i] += j;
            }
            e[i] /= p[idx + i];
            ans += e[i];
        }

        System.out.println(ans);
    }
}