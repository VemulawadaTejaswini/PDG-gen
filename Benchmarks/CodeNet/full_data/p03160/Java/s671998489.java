import java.util.*;
class Main
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cost[] = new int[N];
        for(int i=0;i<N;i++)
        {
            cost[i] =sc.nextInt();
        }

        int dp[] =new int [N+1];

        dp[0]=0;
        dp[1]= cost[1]-cost[0];

        for(int i=2;i< N;i++)
            dp[i] = Math.min(Math.abs(cost[i]-cost[i-1]) + dp[i-1] , Math.abs(cost[i]-cost[i-2]) + dp[i-2]);
       System.out.println( dp[N-1]);

    }


}
