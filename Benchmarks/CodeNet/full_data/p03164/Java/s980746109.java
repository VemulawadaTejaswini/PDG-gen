import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long w=s.nextLong();
    long[] weights=new long[n];
    int[] value=new int[n];
    for(int i=0;i<n;i++){
      weights[i]=s.nextLong();
      value[i]=s.nextInt();
    }
    int total=0;
    for(int i:value){
      total+=i;
    }
    long[] dp=new long[total+1];
    Arrays.fill(dp,w+1);
    dp[0]=0;

    for(int i=0;i<weights.length;i++){
      for(int j=total;j>=0;j--){
        if(j>=value[i]){
          dp[j]=Math.min(dp[j],dp[j-value[i]]+weights[i]);
        }
      }
    }
    long max=0;
    for(int i=0;i<=total;i++){
      if(dp[i]<=w)
      max=Math.max(i,max);
    }
      System.out.println(max);
    }
  }
        
    
    
    