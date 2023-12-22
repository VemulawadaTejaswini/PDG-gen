import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        dp[0] = 0;dp[1] = Math.abs(arr[0]-arr[1]);

        for(int i=2 ;i< N;i++ ){
            dp[i] = Math.min(
                    dp[i-1] + Math.abs(arr[i]-arr[i-1]),
                    dp[i-2] + Math.abs(arr[i]-arr[i-2]));
        }
        System.out.println(dp[N-1]);

    }
}
