import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tk;
    
    int n=Integer.parseInt(br.readLine());
    int task[][]=new int[n][3];
   
    for(int i=0;i<n;i++)
    {
       tk=new StringTokenizer(br.readLine());
      for(int j=0;j<3;j++)
      { 
        task[i][j]=Integer.parseInt(tk.nextToken());
       }
      
    }
    int dp[]=new int[3];
    
     for(int i=0;i<n;i++)
    {
       int new_dp[]=new int[3];
      for(int j=0;j<3;j++)
      {
        for(int k=0;k<3;k++)
        {
           if(j!=k)
             new_dp[j]=Math.max(dp[k]+task[i][j],new_dp[j]);
          
        }
                              
        
      }
       dp=new_dp;  
       
      
      
    }
    System.out.println(Math.max(dp[0] , Math.max(dp[1],dp[2])));
    
    
    
    
    
  }
  
}
 
 