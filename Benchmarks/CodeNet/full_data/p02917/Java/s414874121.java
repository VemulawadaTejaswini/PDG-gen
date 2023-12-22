import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] b = new int[n-1];
      int[] a = new int[n];
      int sum = 0;
      for(int i = 0;i < n-1;i++)b[i]=sc.nextInt();
      a[0]=b[0];
      a[n-1]=b[n-2];
      sum += a[0]+a[n-1];
      for(int i = 1;i < n-1;i++){
      	a[i] = Math.min(b[i],b[i-1]);
        sum += a[i];
      }
      System.out.println(sum);
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