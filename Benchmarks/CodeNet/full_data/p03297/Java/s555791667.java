import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      if(a-b<0){
        System.out.println("No");
        return;
      }
      else{
        if(b==d){
          System.out.println("Yes");
          return;
        }
        else if(b>d){
          System.out.println("No");
          return;
        }
        else if(c>=b){
          System.out.println("Yes");
          return;
        }
      }
      long p = gcd(b,d);
      if((a-c-1)/p>(a-b)/p)System.out.println("No");
      else System.out.println("Yes");
    }
  }
  public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}