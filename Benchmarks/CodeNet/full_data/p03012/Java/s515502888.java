import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sum += w[i];
        }

        int ans = 10000;
        int tmp = 0;
        for (int i = 0; i < n-1; i++) {
            tmp += w[i];
            sum -= w[i];
            ans = Math.min(ans, Math.abs(tmp - sum));
        }

        System.out.println(ans);
    }
}
