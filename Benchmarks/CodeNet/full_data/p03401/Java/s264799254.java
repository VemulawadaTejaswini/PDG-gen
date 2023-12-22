import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        a[0] = 0;
        a[n + 1] = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum += Math.abs(a[i - 1] - a[i]);
        }
        sum += Math.abs(a[n] - a[n + 1]);

        for (int i = 1; i <= n; i++) {
            long ans = sum + Math.abs(a[i - 1] - a[i + 1])
                    - Math.abs(a[i - 1] - a[i]) - Math.abs(a[i] - a[i + 1]);
            System.out.println(ans);
        }
    }

}
