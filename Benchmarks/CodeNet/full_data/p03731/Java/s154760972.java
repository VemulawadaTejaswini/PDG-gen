import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t = sc.nextInt();
      int[] x = new int[n];
      int ans = 0;
      for(int i = 0;i < n;i++)x[i]=sc.nextInt();
      for(int i = 0;i < n-1;i++){
      	ans += Math.min(x[i+1]-x[i],t);
      }
      System.out.println(ans+t);
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