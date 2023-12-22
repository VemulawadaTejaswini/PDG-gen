import java.util.Scanner;
 
public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long ans = x / 11;
    if (6*ans + 5*ans >= x) {
      System.out.println(2*ans);
    } else if (6*(ans+1) + 5*ans >= x) {
      System.out.println(2*ans + 1);
    } else if (6*(ans+1) + 5*(ans+1) >= x) {
      System.out.println(2*ans + 2);
    }
  }
 
  public static void main(String[] args) {
    new Main().run();
  }
}