import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = IntStream.range(0,N).map(i -> scan.nextInt()).toArray();
        Arrays.sort(A);
        int sumA = 0;
        for(int i=0;i<N;++i)sumA+=A[i];
        boolean dp[][] = new boolean[N+1][4002];
        dp[0][2000]=true;
        for(int i=0;i<N;++i){
            for(int j=2000;j<=4000;++j){
                if(!dp[i][j])continue;
                if(j-A[i]>=0)dp[i+1][j-A[i]]=true;
                if(j+A[i]<=4000)dp[i+1][j+A[i]]=true;
            }
        }
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<4002;++i){
            if(dp[N][i]){
                minvalue = Math.min(minvalue, Math.abs(i-2000));
            }
        }
        System.out.println((sumA+minvalue)/2);


    }
}