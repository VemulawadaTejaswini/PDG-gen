import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = in.nextInt();
        }

        int ans = b[0];
        for (int i = 0; i < n - 2; i++) {
            ans += Math.min(b[i], b[i + 1]);
        }
        ans += b[n - 2];

        System.out.println(ans);
    }
}