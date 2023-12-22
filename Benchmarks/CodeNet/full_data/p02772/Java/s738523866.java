import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    int N = Integer.parseInt(sc.next());
    boolean approved = true;
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(sc.next());
      if (num % 2 == 0) {
        if (!(num % 3 == 0 || num % 5 == 0)) {
          approved = false;
          break;
        }
      }
    }

    if (approved) {
      System.out.println("APPROVED");
    } else {
      System.out.println("DENIED");
    }
  }
}
