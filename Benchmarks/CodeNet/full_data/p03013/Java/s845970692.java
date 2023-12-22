import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] a = new int[m];
      int[] dp = new int[n+1];
      List<Integer> list = new ArrayList<Integer>();
      for(int i = 0;i < m;i++){
        a[i] = sc.nextInt();
        list.add(a[i]);
      }
      dp[0] = 0;
      if(list.contains(1)){
        dp[1]=0;
      }else dp[1]=1;
      if(list.contains(2)){
      	dp[2]=0;
      }else dp[2] = dp[1]+1;
      for(int i = 3;i <= n;i++){
      	if(list.contains(i)) dp[i]=0;
        else dp[i]=dp[i-1]+dp[i-2];
      }
      System.out.println(dp[n]);
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}