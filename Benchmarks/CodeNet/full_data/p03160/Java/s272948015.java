import java.util.*;
class Frog1_atcoder {
    static int calculate_cost(int h[],int N)
    {
        int dp[]=new int[N];
        dp[0]=0;
        dp[1]=Math.abs(h[0]-h[1]);
        int i;
        for(i=2;i<N;i++)
        {
            dp[i]=Math.min((Math.abs(h[i]-h[i-1])+dp[i-1]),(Math.abs(h[i]-h[i-2])+dp[i-2]));

        }
        return dp[N-1];
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int N=sc.nextInt();
        sc.nextLine();
        int h[]=new int[N];
        StringTokenizer tk=new StringTokenizer(sc.nextLine());
        for(i=0;i<N;i++)
            h[i]=Integer.parseInt(tk.nextToken());
        int totalcost=calculate_cost(h,N);
        System.out.println(totalcost);
    }

}
