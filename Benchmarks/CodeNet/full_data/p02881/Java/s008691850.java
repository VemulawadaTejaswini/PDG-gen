import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long g = (long) Math.sqrt(n);
    if (g*g == n){
      System.out.println(g*2-2);
      return;
    }

    for (long i=g;i>0;i--){
      if (n%i == 0){
        long p = (long) n/i;
        System.out.println(p+i-2);
        return;
      }
    }
  }
}
