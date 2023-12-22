import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   int[] b = new int[N];
   int[] c = new int[N];

   for(int i=0;i<N;i++)
   {
     a[i] = sc.nextInt();
     b[i] = sc.nextInt();
     c[i] = sc.nextInt();
   }
   int[] dp = new int[N+1];
   dp[0]=0;
   boolean aflg = true;
   boolean bflg = true;
   boolean cflg = true;
   for(int i=1;i<N;i++)
   {
     if(a[i]>b[i]&&a[i]>c[i]&&aflg) 
     {
       dp[i]=dp[i-1]+a[i-1];
       aflg = false;
       bflg = true;
       cflg = true;
     }
     else if(b[i]>a[i]&&b[i]>c[i]&&bflg) 
     {
       dp[i]=dp[i-1]+b[i-1];
       aflg = true;
       bflg = false;
       cflg = true;       
     }
     else 
     {
       dp[i]=dp[i-1]+c[i-1];
       aflg = true;
       bflg = true;
       cflg = false;
     }
   }
   System.out.println(dp[N]);
 }
}