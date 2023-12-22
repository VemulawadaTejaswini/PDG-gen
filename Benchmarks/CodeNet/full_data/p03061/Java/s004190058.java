import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int[] l = new int[n+1];
      int[] r = new int[n+1];
      int[] m = new int[n+1];
      int max = 0;
      l[0]=0;
      r[n]=0;
      for(int i = 0;i < n;i++)l[i+1]=gcd(l[i],a[i]);
      for(int i = n-1;i >= 0;i--)r[i]=gcd(r[i+1],a[i]);
      for(int i = 1;i <= n;i++){
        m[i]=gcd(l[i-1],r[i]);
        max = Math.max(m[i],max);
      }
      System.out.println(max);
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