import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean cnt = false;
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N; j++) {
        if (i * 4 + j * 7 == N) {
          cnt = true;
        }
      }
      if (cnt) {
        break;
      }
    }
    if (cnt) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
