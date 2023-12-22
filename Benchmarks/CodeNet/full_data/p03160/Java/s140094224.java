import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        int[] h = new int[steps];
        for (int i = 0; i < steps; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[steps];
        Arrays.fill(dp,INF);
        dp[0] = 0;
        dp[1] = Math.abs(h[0]-h[1]);
        for(int i=2; i<dp.length; i++){
            changeMin(dp,dp[i-2]+Math.abs(h[i-2]-h[i]),i);
            changeMin(dp,dp[i-1]+Math.abs(h[i-1]-h[i]),i);
        }
        System.out.println(dp[dp.length-1]);
    }

    public static final int INF = 100000;
    public static void changeMin(int[] array, int value, int index){
        if(array[index] <= value) return;
        array[index] = value;
    }
}