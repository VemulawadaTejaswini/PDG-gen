
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        int arr[]=new int[n];
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
        }
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=Math.min(i+k,n-1);j++){
                dp[j]=Math.min(Math.abs(arr[i]-arr[j])+dp[i], dp[j]);
            }
        }
        System.out.println(dp[n-1]);
    }
}
