import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    long ans = 1;
    if(X<2*Y&&Y<2*X&&(X+Y)%3==0){
      int sa = Math.abs(X-Y); //差の絶対値
      int sum = (X+Y)/3;
      int L = (sum-sa)/2+sa;
      long sumK=1;
      for(long i = L+1;i<=sum;i++){
      ans=ans*i;
      if(ans>=1000000007){
        ans= ans%1000000007;
      }
      }
    }else{
      ans = 0;
    }
     System.out.println(ans);
  }
}