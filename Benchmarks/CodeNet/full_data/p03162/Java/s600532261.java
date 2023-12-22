import java.util.Scanner;
class Main{
	public static void main(String [] args){
    	Scanner sc=new Scanner(System.in);
      	
      	int n=sc.nextInt();
      	int a[]=new int[n];
      	int b[]=new int[n];
      	int c[]=new int[n];
      	
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
        b[i]=sc.nextInt();
        c[i]=sc.nextInt();
      }
      
      int dp[][]=new int[3][n];
      dp[0][0]=a[0];
      dp[0][1]=b[0];
      dp[0][2]=c[0];
      for(int i=1;i<n;i++){
      		dp[0][i]=Math.max(a[i]+dp[1][i-1],a[i]+dp[2][i-1]);
        	dp[1][i]=Math.max(b[i]+dp[0][i-1],b[i]+dp[2][i-1]);
        	dp[2][i]=Math.max(c[i]+dp[1][i-1],c[i]+dp[0][i-1]);
      }
      
      int res=Math.max(Math.max(dp[0][n-1],dp[1][n-1]),dp[2][n-1]);
      System.out.println(res);
      
    }
}