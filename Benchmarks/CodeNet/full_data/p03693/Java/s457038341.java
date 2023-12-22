import java.util.Scanner;
 
public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int x = 100*r + 10*g + b;

    if (x % 4 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
 
  public static void main(String[] args) {
    new Main().run();
  }
}
