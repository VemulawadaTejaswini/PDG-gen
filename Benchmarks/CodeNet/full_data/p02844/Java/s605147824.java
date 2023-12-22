import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    String S = in.next();
    System.out.println(solve(N, S));
  }

  private static int solve(int N, String S) {
    int ret = 0;
    for (int i = 0; i < 1000; i++) {
      if (can(i, S))
        ret++;
    }
    return ret;
  }

  private static boolean can(int i, String S) {
    String key = String.format("%03d", i);

    int startIndex = 0;
    for (int j = 0; j < 3; j++) {
      int index = S.indexOf(key.charAt(j), startIndex);
      if (index < 0)
        return false;
      startIndex = index + 1;
    }
    return true;
  }
}