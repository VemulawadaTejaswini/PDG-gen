import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextInt();
    long b = scan.nextInt();
    long c = scan.nextInt();
    scan.close();

    if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}