import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    
    
    if (a>k) {
      a -= k;
    }
    else {
      k -= a;
      a = 0;
      if (b>k) {
        b -= k;
      }
      else {
        b = 0;
      }
    }
    
    System.out.println(a + " " + b);
    
  } 
}