import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = IntStream.range(0,N).map(i->scan.nextInt()).toArray();

        int sumA = 0;
        for(int i=0;i<N;++i)sumA+=A[i];
        boolean dp[] = new boolean[100001];
        int minvalue = Integer.MAX_VALUE;

        dp[0]=true;
        for(int i=0;i<N;++i){
            boolean newdp[] = new boolean[100001];
            for(int j=0;j<=100000;++j){
                if(!dp[j])continue;
                newdp[Math.abs(j-A[i])]=true;
                if(j+A[i]<=100000)newdp[j+A[i]]=true;
            }
            dp = newdp;
        }
        for(int i=0;i<100000;++i){
            if(dp[i]){
                minvalue = Math.min(minvalue, i);
                break;
            }
        }


        System.out.println((sumA+minvalue)/2);


    }
}