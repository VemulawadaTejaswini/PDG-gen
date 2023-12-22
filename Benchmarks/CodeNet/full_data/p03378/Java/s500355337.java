import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int n, m, x, i=0, p, a=0, b=0;
      n = Integer.parseInt(scan.next());
      m = Integer.parseInt(scan.next());
      x = Integer.parseInt(scan.next());

      while(i<m){
        p = Integer.parseInt(scan.next());
        if(p<x){
          a = ++a;
        }else if(p>x){
          b = ++b;
        }
        i = ++i;
      }

      System.out.println(Math.min(a, b));
    }
    catch (Exception e) {
      
    }
  }
}