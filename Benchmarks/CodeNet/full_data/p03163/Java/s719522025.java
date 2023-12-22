import java.util.*;
public class Main{
	public static void main(String args[]){
    
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int W=sc.nextInt();
      	int w[]=new int[n+1];
      	int v[]=new int[n+1];
      	for(int i=1;i<=n;i++){
        	w[i]=sc.nextInt();
          	v[i]=sc.nextInt();
        }
      	long dp[][]=new long[n+1][W+1];
      	
      	//Logic
      
      for(int i=0;i<=n;i++){
      	for(int j=0;j<=W;j++){
        
        	if(i == 0 || j == 0){
            	dp[i][j] = 0;
              	continue;
            }
        	
          	if(w[i]>j){
            	dp[i][j]=dp[i-1][j];
              	continue;
            }
          
          	dp[i][j] = Math.max(dp[i-1][j],v[i]+dp[i-1][j-w[i]]);
        
        }
      }
      System.out.println(dp[n][W]);  
    
    
    }
}