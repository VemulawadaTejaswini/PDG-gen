import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        if (k == 0) {
            System.out.println(n * n);
            sc.close();
            return;
        }

        for (int b = k+1; b <= n; b++) {
            int p = n / b;
//            int r = n - p * b;
            int r = n % b;
            ans += p * Math.max(0, b - k);
            ans += Math.max(0, r - k + 1);
        }

        System.out.println(ans);
        sc.close();
    }

}
