import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(arr[1]-arr[0]);

        for (int i = 3; i <= N ; i++) {

            dp[i]= Math.min(
                    dp[i-1] + Math.abs(arr[i-1]-arr[i-2]),
                    dp[i-2] + Math.abs(arr[i-1]-arr[i-3])
            );

        }

        System.out.println(dp[N]);


    }

}
