import java.util.*;
 class Frog1_atcoder {
    static int calculate_cost(int cost[],int n)
    {
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(cost[0]-cost[1]);
        int i;
        for(i=2;i<n;i++)
        {
            dp[i]=Math.min((Math.abs(cost[i]-cost[i-1])+dp[i-1]),(Math.abs(cost[i]-cost[i-2])+dp[i-2]));

        }
        return dp[n-1];
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        sc.nextLine();
        int cost[]=new int[n];
        StringTokenizer tk=new StringTokenizer(sc.nextLine());
        for(i=0;i<n;i++)
            cost[i]=Integer.parseInt(tk.nextToken());
        int totalcost=calculate_cost(cost,n);
        System.out.println(totalcost);
    }

}
