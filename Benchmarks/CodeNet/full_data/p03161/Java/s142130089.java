import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


       // BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int dp[] = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++) {
          for(int j=(i+1);j<=(i+k);j++) {
              if(j<n) {
                  dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[i]-arr[j]));
              }
          }
        }

        System.out.println(dp[n-1]);
    }
}