import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        if(n==1)
            System.out.println(0);

        int dp[] = new int[n];

        dp[0] = 0;
        //dp[1] = Math.abs(a[0]-a[1]);

        for(int i=1; i<n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=i-k; j<i; j++) {
                if (j>=0 && (dp[i] > dp[j] + Math.abs(a[j]-a[i]))) {
                    dp[i] = dp[j] + Math.abs(a[j]-a[i]);
                }
            }
        }
        System.out.println(dp[n-1]);
    }

}
