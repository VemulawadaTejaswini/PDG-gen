import java.util.*;
class Main {
  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    } else {
	  int remainder = m % n;
      return gcd(n, remainder);
  }
  
  public static int findNum(int a, int b, int c, int d) {
    int numOfC = b/c - ((a-1)/c);
    int numOgD = b/d - ((a-1)/d);
    int numOfGcd = b/gcd(c, d) - ((a-1)/gcd(c, d));
    
    return (b-a+1) - (numOfC + numOfD - numOfGcd);
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