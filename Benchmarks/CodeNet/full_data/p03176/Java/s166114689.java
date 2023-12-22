public class Main
{
  public static void main(String args[])
  {int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      int h[]=new int[n];
      for(int i=0;i<n;i++)
      {
          h[i]=sc.nextInt();
          a[i]=sc.nextInt();
      }
        int ans=0;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {if(h[j]<h[i])
                
                dp[i]=Math.max(dp[i],dp[j]+a[i]);
            
            else
            {
                dp[i]=a[i];
            }
        }
            if(dp[i]>ans)
            { 
              
            ans=dp[i];
            
        }
        
      
    }
     System.out.println(ans);
      
}
}