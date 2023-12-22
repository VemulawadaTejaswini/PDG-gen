import java.util.Scanner;
public class Main  {
  int H,W;
  void run() {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    for(int i = 0; i < H; i++) {
      String s = sc.next();
      System.out.println(s);
      System.out.println(s);
    }
  }
  public static void main(String[] args) {
    new Main().run();
  }
}
