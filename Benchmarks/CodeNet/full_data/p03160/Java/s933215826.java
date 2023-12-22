import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stones = s.nextInt();
        int arr[] = new int[stones];
        for(int i= 0;i<stones;i++){
            arr[i] = s.nextInt();
        }
        long dp[] = new long[stones];
        dp[0] = 0;
        for(int i= 1;i<stones;i++){
            long option1 = Math.abs(arr[i]-arr[i-1])+dp[i-1];
            long option2 = i==1?Integer.MAX_VALUE:Math.abs(arr[i]-arr[i-2])+dp[i-2];
            dp[i] = Math.min(option1,option2);
        }
        System.out.println(dp[stones-1]);
    }
}
