import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] H = new int[n];
        int[] dp = new int[3];
        Arrays.setAll(H, i -> Integer.parseInt(sc.next()));
        dp[1] = Math.abs(H[1] - H[0]);
        for(int i = 2; i < n; i++) {
            dp[i % 3] = Math.min(dp[(i-1) % 3] + Math.abs(H[i] - H[i-1]),
                            dp[(i-2) % 3] + Math.abs(H[i] - H[i-2]));
        }
        System.out.println(dp[(n-1) % 3]);
    }
}
