import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] heights = new int[N];
        for(int i=0;i<N;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(frog1(heights,K));
    }

    static int frog1(int[] heights,int K){
        int[] dp= new int[heights.length];
        dp[0]= 0;
        dp[1]= Math.abs(heights[1]-heights[0]);
        for(int i=2;i<heights.length;i++){
            int min = Integer.MAX_VALUE;
            for(int k=1;k<=K;k++){
                if(i-k>=0){
                    int cost = dp[i-k] +Math.abs(heights[i]-heights[i-k]);
                    min = (min > cost) ? cost: min;
                }
            }
            dp[i] = min;
        }
        return dp[heights.length-1];
    }
}
