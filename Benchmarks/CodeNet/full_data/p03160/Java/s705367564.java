import java.util.Scanner;

class dp{


// https://atcoder.jp/contests/dp/tasks/dp_a
// problem A

    public static int frog1(int[] costs){
        int n = costs.length;
        int[] dp = new int[n];

        dp[1] = Math.abs(costs[1]-costs[0]);
        for(int i=2;i<n;i++){
            dp[i] = Math.min( Math.abs(costs[i]-costs[i-2] )+ dp[i-2], Math.abs(costs[i]-costs[i-1])+dp[i-1] );
        }
        // for(int i:dp) System.out.print(i+" ");
        return dp[n-1];

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //     int[][] cost = {{1,2,3},{4,5,6}};
    //     int m = cost.length;
    //     int n = cost[0].length;
    //     int[][] dp = new int[m][n];
    //     // System.out.println(minPathSumM(0, 0, m-1, n-1, cost, dp));
    //     System.out.println(minPathSumT(cost, dp));
    
    // for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         System.out.print(cost[i][j]+" ");
    //     }
    //     System.out.println("");
    // }       

    // int[][] grid = {
    //     {0,1,-1},{1,0,-1},{1,1,1}};
    //     cherryPickup(grid);
    // }
    int n = sc.nextInt();
        int[] costs = new int[n];
        for(int i=0;i<n;i++){
            costs[i] = sc.nextInt();
        }
    System.out.println(frog1(costs));
}

}
