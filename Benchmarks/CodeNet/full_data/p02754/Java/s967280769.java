import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());

    if (n >= a + b) {
      System.out.println(n / (a + b) * a + (n % (a + b)));
    } else {
      System.out.println(a);
    }
    sc.close();
  }
}
