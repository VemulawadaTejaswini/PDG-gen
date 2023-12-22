import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long x = (long)Math.min(m,n);
      long y = (long)Math.max(m,n);
      if(x==1&&y==1)System.out.println(1);
      else if(x==1)System.out.println(y-2);
      else System.out.println((x-2)*(y-2));
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
