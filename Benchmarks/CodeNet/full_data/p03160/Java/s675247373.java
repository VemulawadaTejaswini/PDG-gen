import java.util.*;
class A {	
  public static void main(){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int [] a = new int [n];
  for (int i=1;i<=n;i++){
  	a[i] = sc.nextInt();
  }
  System.out.println(getMin(a,dp,1,n));  
  }
  
  public int getMin(int []a ,int [] dp,int i ,int n){
  	if(i==n)
      return 0;
    if(dp[i]!=-1)return dp[i];
    int cost = Math.abs(a[i]-a[i+1]) + getMin(a,dp,i+1,n);
    if(i+2<=n)
      cost = Math.min(cost, Math.abs(a[i]-a[i+2]) + getMin(a,dp,i+2,n));
  	return dp[i] = cost;
  } 
}