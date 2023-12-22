import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int _k = k;
    for (int i = 0; i < k && i < (a + b) / 2; i++) {
      System.out.println(a + i);
      _k = i - 1;
    }
    for (int i = _k - 1; i >= 0; i--) {
      System.out.println(b - i);
    }
  }

}
