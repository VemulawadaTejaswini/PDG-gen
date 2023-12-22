import java.lang.*;
import java.util.*;


public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int k = scan.nextInt();

    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }

    long sum = max * (long)Math.pow(2, k) + a + b + c - max;
    System.out.println(sum);
  }
}