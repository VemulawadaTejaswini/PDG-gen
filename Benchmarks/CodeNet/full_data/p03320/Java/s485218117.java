import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int K = Integer.parseInt(sc.next());
    int ans = 0, add = 1;
    for (int i = 0; i < K; i++) {
      if (i > 8) {
        add = 10;
      }
      ans += add;
      System.out.println(ans);
    }
  }
}