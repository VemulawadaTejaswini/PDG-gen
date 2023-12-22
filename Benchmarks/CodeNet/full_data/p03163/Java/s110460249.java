import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
  public static void main(String agrgs[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int W=sc.nextInt();
    long w[]=new long[n];
    long v[]=new long[n];
    for(int i=0;i<n;i++){
        w[i]=sc.nextInt();
        v[i]=sc.nextInt();
    }
    long dp[][]=new long[n+1][W+1];
    for(int i=0;i<=n;i++){
        for(int wt=0;wt<=W;wt++){
            if(i==0||wt==0){
                dp[i][wt]=0;
            }
            else if(w[i-1]<=wt){
                dp[i][wt]=Math.max(v[i-1]+dp[i-1][wt-(int)w[i-1]],dp[i-1][wt]);
            }
            else{
                dp[i][wt]=dp[i-1][wt];
            }
        }
    }
    // for(int i=0;i<=n;i++){
    //     for(int wt=0;wt<=W;wt++){
    //         System.out.print(dp[i][wt]+" ");
    //     }
    //     System.out.println();
    // }
    System.out.println(dp[n][W]);
  }
}
