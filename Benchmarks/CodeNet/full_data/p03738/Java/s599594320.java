import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    int a = A.length();
    int b = B.length();
    String x = "";
    String y = "";
    if(A.equals(B)) {
      System.out.println("EQUAL");
    } else if(a > b) {
      System.out.println("GREATER");
    } else if(a < b) {
      System.out.println("LESS");
    } else {
      for(int i=0; i<a; i++) {
        if(x.equals(y)) {
          x = A.substring(i, i+1);
          y = B.substring(i, i+1);
        } else {
          if(Integer.parseInt(x) > Integer.parseInt(y)) {
            System.out.println("GREATER");
          } else {
            System.out.println("LESS");
          }
          break;
        }
      }
    }
  }
}