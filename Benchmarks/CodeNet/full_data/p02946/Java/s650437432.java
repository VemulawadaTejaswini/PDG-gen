import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int K = scn.nextInt();
    int X = scn.nextInt();

    for (int i = X - (K - 1); i <= X + (K - 1); i++) {
      if (i >= -1000000 && i <= 1000000) {
        System.out.printf("%d ", i);
      }
    }

  }

}
