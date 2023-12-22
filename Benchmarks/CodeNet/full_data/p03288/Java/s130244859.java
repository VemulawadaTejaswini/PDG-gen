import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int r = sc.nextInt();
    if (r < 1200) {
      System.out.println("ABC");
    } else if (r < 2800) {
      System.out.println("ARC");
    } else {
      System.out.println("AGC");
    }
  }
}

