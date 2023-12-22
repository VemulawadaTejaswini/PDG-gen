import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    int e = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());

    if (b - a > k || c - a > k || d - a > k || e - a > k || c - b > k || d - b > k || e - b > k || d - c > k || e - c > k || e - d > k) {
      System.out.println(":(");
    } else {
      System.out.println("Yay!");
    }
  }
}
