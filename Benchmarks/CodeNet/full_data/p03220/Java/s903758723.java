import java.util.Scanner;

public class Main {
    public static double temp(int t, int x) {
        return t - x * 0.006;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i ++) {
            h[i] = sc.nextInt();
        }

        double minDiff = Math.abs(a - temp(t, h[0]));
        int num = 0;
        for (int i = 1; i < n; i++) {
            double hoge = Math.abs(a - temp(t, h[i]));
            if (minDiff > hoge) {
                minDiff = hoge;
                num = i;
            }
        }

        System.out.println(num + 1);
    }
}