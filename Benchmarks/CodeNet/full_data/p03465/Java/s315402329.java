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
        int k = (sumA)/2;
        //k以下の最大値
        int dp[]= new int[k+1];
        for(int i=0;i<N;++i){
            int newdp[]=new int[k+1];
            for(int j=0;j<=k;++j){
                if(j-A[i]>=0){
                    newdp[j]=dp[j-A[i]]+A[i];
                }else{
                    newdp[j]=dp[j];
                }
            }
            dp = newdp;
        }
        System.out.println(sumA - dp[k]);


    }
}