import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();

    long ka = (k + 1) / 2;
    long kb = k / 2;
    a -= ka;
    b -= kb;

    if (a < 0 || b < 0) {
      if (a < 0 && b < 0) {
        a = 0;
        b = 0;
      }
      else if (a < 0) {
        b = Math.max(0, a + b);
        a = 0;
      }
      else {
        a = Math.max(0, a + b);
        b = 0;
      }
    }

    String ans = Long.toString(a) + " " + Long.toString(b);

    System.out.println(ans);    
    
    sc.close(); 
  }
}
