import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = x/100;
      int z = x%100;
      for(int i=5;i>=1;i--){
        int k = z/i;
        z-=k*i;
        y-=k;
      }
      if(y>=0)System.out.println(1);
      else System.out.println(0);
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