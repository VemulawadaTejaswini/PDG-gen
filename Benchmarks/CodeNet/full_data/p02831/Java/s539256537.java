import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
	int tmp;
    int g = 1;
    
    if (a < b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    g = gcd(a, b);
    
    System.out.print(a*b/g);
    
  }
  
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}
