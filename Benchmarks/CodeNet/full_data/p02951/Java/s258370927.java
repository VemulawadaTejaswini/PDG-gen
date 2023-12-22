import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int A = scn.nextInt();
    int B = scn.nextInt();
    int C = scn.nextInt();

    int ans = C - (A - B);
    if (ans < 0) {
      ans = 0;
    }
    System.out.println(ans);

  }
}