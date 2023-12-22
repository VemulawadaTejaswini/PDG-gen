import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    if (A < 10 && B < 10) {
      System.out.println(A * B);
    } else {
      System.out.println(-1);
    }
  }
}
