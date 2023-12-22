import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long x = -sc.nextLong()+sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long s = x/c;
    long t = x/d;
    long u = x/(c*d);
    
    long ans = x-(s+t)+u;
    
    System.out.println(ans);
  }
}