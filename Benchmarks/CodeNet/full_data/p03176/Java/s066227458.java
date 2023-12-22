/**
 * Write a description of class flowers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */import java.util.*;
public class Main
{
  public static void main(String args[])
  {int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      int h[]=new int[n];
       int dp[]=new int[n];
      for(int i=0;i<n;i++)
      {
          h[i]=sc.nextInt();
         
      }
      for(int i=0;i<n;i++)
      {
            a[i]=sc.nextInt();
          dp[i]=a[i];
      }
        int ans=0;
      for(int u=0;u<n;u++)
          
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {if(h[j]<h[i])
                
                dp[i]=Math.max(dp[i],dp[j]+a[i]);
            
            }
          
            if(dp[i]>ans)
            { 
              
            ans=dp[i];
            
        }
        
      
    }
     System.out.println(ans);
      
}
}
