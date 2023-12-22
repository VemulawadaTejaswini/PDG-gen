import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    String s = sc.next();
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(s.charAt(i));
      }
    }
    System.out.println();
  }
}
