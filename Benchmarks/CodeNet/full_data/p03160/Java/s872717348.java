
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        for(int i=0;i<N;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(frog1(heights));
    }

    static int frog1(int[] heights){

        int[] dp= new int[heights.length];
        dp[0]= 0;
        dp[1]= Math.abs(heights[1]-heights[0]);

        for(int i=2;i<heights.length;i++){
            dp[i] = Math.min(
                    dp[i-1] +Math.abs(heights[i]-heights[i-1]),
                    dp[i-2] +Math.abs(heights[i]-heights[i-2])
            );
        }
        return dp[heights.length-1];
    }
}