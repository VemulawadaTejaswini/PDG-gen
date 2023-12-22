import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = std.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (i + k > n) {
                break;
            }

            int l = xs[i];
            int r = xs[i + k - 1];
            int time = Math.abs(l) + Math.abs(r - l);
            ans = Math.min(time, ans);
        }

        System.out.println(ans);
    }
}
