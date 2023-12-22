import java.util.*;
public class Main{
	public static void main(String args[]){
    
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int W=sc.nextInt();
      	long w[]=new long[n+1];
      	long v[]=new long[n+1];
      	int sum_values = 0;
      	for(int i=1;i<=n;i++){
        	w[i]=sc.nextInt();
          	v[i]=sc.nextInt();
          	sum_values+= v[i];
        }
      	long dp[][]=new long[n+1][sum_values+1];
      	
      	for(int i=0;i<=n;i++)
      	for(int j=0;j<=sum_values;j++)
      	dp[i][j]=Integer.MAX_VALUE;
      	//Logic
        long answer=0;
      for(int i=1;i<=n;i++){
      	for(int j=0;j<=sum_values;j++){
        
        	if(i == 0 || j == 0){
            	dp[i][j] = 0;
              	continue;
            }
            if(i == 1){
                if(j == v[i]){
                    dp[i][j]=w[i];
                }
            }
        	
          	if(v[i]>j){
            	dp[i][j]=Math.min(dp[i][j],dp[i-1][j]);
              	continue;
            }
          
          	dp[i][j] = Math.min(Math.min(dp[i][j],dp[i-1][j]),w[i]+dp[i-1][(int)(j-v[i])]);
        
        }
      }
      for(int i=sum_values;i>=0;i--){
          if(dp[n][i] <= W)
          {
              answer = i;
              break;
          }
      }
      System.out.println(answer);  
    
    
    }
}