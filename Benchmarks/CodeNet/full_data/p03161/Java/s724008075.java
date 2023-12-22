import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int h[]=new int[N];
        for(int i=0;i<N;++i) {
            h[i]=sc.nextInt();
        }
        int dp[]=new int[N];
        dp[0]=0;
//        dp[1]=Math.abs(h[1]-h[0]);
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=1;i<N;++i) {
            dp[i]=Integer.MAX_VALUE;
            for(int j=i-1;j>=0&&j>=i-K;--j) {
                dp[i]=Math.min(dp[j]+Math.abs(h[i]-h[j]),dp[i]);
            }
        }
        System.out.println(dp[N-1]);
    }
}