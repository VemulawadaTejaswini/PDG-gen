import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] t = new long[n];
      long[] a = new long[n];
      for(int i = 0;i < n;i++){
      	t[i] = sc.nextLong();
        a[i] = sc.nextLong();
      }
      for(int i = 0;i < n-1;i++){
          long ft = t[i]/t[i+1]+(t[i]%t[i+1]==0?0:1);
          long fa = a[i]/a[i+1]+(a[i]%a[i+1]==0?0:1);
          long f = Math.max(fa,ft);
          t[i+1] *= f;
          a[i+1] *= f;
      }
      System.out.println(t[n-1]+a[n-1]);
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