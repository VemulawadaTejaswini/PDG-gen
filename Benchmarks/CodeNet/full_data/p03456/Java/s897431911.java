import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    String sa = String.valueOf(a);
    String sb = String.valueOf(b);
    String sab = sa + sb;
    int iab = Integer.parseInt(sab);
    boolean s = false;
    for (int i = 0; i < 1000; i++) {
      if (i * i == iab) {
        System.out.println("Yes");
        s = true;
        break;
      }
    }
    if (s == false) {
      System.out.println("No");
    }
  }
}
