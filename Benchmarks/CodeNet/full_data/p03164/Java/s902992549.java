import java.util.Scanner;

public class Main {

    public static long dpSol(int a[][],int n,int w,long dp[][]){
       // System.out.println(n+" n "+w+"  w "+dp[n][w]);
        if(n==0){
            return 0;
        }
        if(w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        long ans1=-1;
        if(w>=a[n][1]){
            ans1 = dpSol(a,n-1,w-a[n][1],dp)+a[n][2];
        }
        long ans2 = dpSol(a,n-1,w,dp);
       // System.out.println(ans2+" ans 2 ");

        dp[n][w]=Math.max(ans1,ans2);
        //System.out.println(dp[n][w]);
        return dp[n][w];
    }
    public static long recSol(int a[][],int n,long w){
        if(n==0){
            return 0;
        }
        if(w==0){
            return 0;
        }
        long ans1=-1;
        if(w>=a[n][1]) {
             ans1 = recSol(a, n - 1, w - a[n][1]) + a[n][2];
        }
        long ans2 = recSol(a,n-1,w);
        //System.out.println(n+" "+Math.max(ans1,ans2));
        return Math.max(ans1,ans2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        int a[][] = new int[n+1][3];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //long dp[][]= new long[n+1][w+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=w;j++){
//                dp[i][j] = -1;
//            }
//        }
        System.out.println(recSol(a,n,w));

    }
}
