import java.util.*;
class Main {
  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    } else {
      return gcd(n, m%n);
    }
  }
  
  public static int findNum(int a, int b, int c, int d) {
    int lcm = c * d / gcd(c, d);
    return (b - b/c - b/d + b/lcm) - ((a-1) - (a-1)/c - (a-1)/d + (a-1)/lcm);
  }
    
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    
    int result = findNum(a, b, c, d);
    System.out.println(result);
  }
}
